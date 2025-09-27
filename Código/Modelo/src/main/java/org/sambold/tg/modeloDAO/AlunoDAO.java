package org.sambold.tg.modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.sambold.tg.conexao.Conexao;
import org.sambold.tg.tgmodeloBeans.Aluno;

public class AlunoDAO {

    // Lista ALUNOS, não "usuarios"
    public List<Aluno> listarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT ra, nome, email, curso, turno, senha FROM aluno";

        try (Connection conn = Conexao.get();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String ra    = rs.getString("ra");
                String nome  = rs.getString("nome");
                String email = rs.getString("email");
                String curso = rs.getString("curso");
                String turno = rs.getString("turno");
                String senha = rs.getString("senha"); // já vem hash? deveria.

                alunos.add(new Aluno(ra, nome, email, curso, turno, senha));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    // Insere exatamente as colunas da sua tabela.
    // Se 'created_at' tem DEFAULT CURRENT_TIMESTAMP no banco, NÃO precisa setar aqui.
    public boolean inserirAluno(Aluno aluno) {
        // Se 'created_at' NÃO tiver default no banco, use a versão com created_at abaixo.
        String sql = "INSERT INTO aluno (ra, nome, email, curso, turno, senha) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.get();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getRa());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getCurso());
            stmt.setString(5, aluno.getTurno());
            stmt.setString(6, aluno.getSenha()); // traga HASH aqui

            int rows = stmt.executeUpdate();
            return rows == 1;

        } catch (java.sql.SQLIntegrityConstraintViolationException dup) {
            System.err.println("RA ou e-mail já cadastrado: " + dup.getMessage());
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Versão alternativa caso precise setar created_at manualmente:
    // String sql = "INSERT INTO aluno (ra, nome, email, curso, turno, senha, created_at) VALUES (?, ?, ?, ?, ?, ?, NOW())";
}
