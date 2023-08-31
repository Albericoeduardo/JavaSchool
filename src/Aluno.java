import java.util.*;

public class Aluno {
    public String nome;
    public String sobrenome;
    public Curso curso;
    public double matricula;
    public List<Disciplina> disciplinas;
    public boolean estaMatriculado;

    public Aluno(){
        this.disciplinas = new ArrayList<>();
    }

    public Aluno(String nome, String sobrenome, int idade, String curso, int matricula, int periodo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    
    
    public void matricular(Disciplina disc){
        this.matricula = Math.random();
        this.estaMatriculado = true;
        System.out.println(this.matricula);
        System.out.println("O aluno foi matriculado em: " + disc.nome);
        disciplinas.add(disc);
    }

    public void obterComprovanteMatricula(){
        for (Disciplina disciplina : disciplinas){
            System.out.println(disciplina.nome);
        }
    }
}
