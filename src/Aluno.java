import java.util.*;

public class Aluno {
    public String nome;
    public String sobrenome;
    public Curso curso;
    public double matricula;
    public List<Disciplina> disciplinas;
    public boolean estaMatriculado;

    public Aluno(){

    }

    public Aluno(String nome, String sobrenome, int idade, String curso, int matricula, int periodo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    public void matricular() {
        System.out.println("O aluno foi matriculado");
        this.matricula = Math.random();
        this.estaMatriculado = true;
    }
}
