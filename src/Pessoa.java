public class Pessoa {
    //Atributos
    public String nome;
    public String sobrenome;
    public String sexo;
    public double altura;
    public int idade;

    //Construtores podem ou não ter parametros 

    //Construtor
    public Pessoa(){

    }

    //Construtor
    public Pessoa(String nome, String sobrenome, String sexo, double altura, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    //Metodo
    public void andar(){
        System.out.println(this.nome + "está andando");
    }
}
