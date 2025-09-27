package org.sambold.tg.modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.sambold.tg.conexao.Conexao;
import org.sambold.tg.tgmodeloBeans.Aluno;

public class AuthDAO {

    public static class AuthResult {
        public enum Role { ALUNO, PROFESSOR }
        private final boolean ok;
        private final Role role;
        private final Aluno aluno;     // se ALUNO
        private final String nomeProf; // se PROFESSOR
        private final String email;

        private AuthResult(boolean ok, Role role, Aluno aluno, String nomeProf, String email) {
            this.ok = ok; this.role = role; this.aluno = aluno; this.nomeProf = nomeProf; this.email = email;
        }
        public static AuthResult aluno(Aluno a){ return new AuthResult(true, Role.ALUNO, a, null, a.getEmail()); }
        public static AuthResult professor(String nome, String email){ return new AuthResult(true, Role.PROFESSOR, null, nome, email); }
        public static AuthResult fail(){ return new AuthResult(false, null, null, null, null); }

        public boolean isOk(){ return ok; }
        public Role getRole(){ return role; }
        public Aluno getAluno(){ return aluno; }
        public String getNomeProf(){ return nomeProf; }
        public String getEmail(){ return email; }
    }

 public AuthResult autenticar(String email, String senha) {
    // 1) Tenta ALUNO
    final String sqlAluno =
        "SELECT ra, nome, email FROM aluno WHERE email = ? AND senha = ? LIMIT 1";

    try (Connection c = Conexao.get();
         PreparedStatement ps = c.prepareStatement(sqlAluno)) {

        ps.setString(1, email);
        ps.setString(2, senha);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                Aluno a = new Aluno();
                a.setRa(rs.getString("ra"));
                a.setNome(rs.getString("nome"));
                a.setEmail(rs.getString("email"));
                return AuthResult.aluno(a);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    // 2) Tenta PROFESSOR
    final String sqlProf =
        "SELECT nome, email FROM professor WHERE email = ? AND senha = ? LIMIT 1";

    try (Connection c = Conexao.get();
         PreparedStatement ps = c.prepareStatement(sqlProf)) {

        ps.setString(1, email);
        ps.setString(2, senha);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String nome = rs.getString("nome");
                String mail = rs.getString("email");
                return AuthResult.professor(nome, mail);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return AuthResult.fail();
}
 }
