
package org.sambold.tg.tgmodeloBeans;

public class Aluno {
    private String ra;
    private String nome;
    private String email;
    private String curso;
    private String turno;
    private String senha; 

    public Aluno() {}

    public Aluno(String ra, String nome, String email, String curso, String turno, String senha) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.turno = turno;
        this.senha = senha;
    }


    public String getRa() { return ra; }
    public void setRa(String ra) { this.ra = ra; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) {this.curso = curso; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
