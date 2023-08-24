import java.util.*;

public class Aula02 {
    public static void main(String[] args) throws Exception {
        //ATIVIDADE 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha!");
        String senha = scanner.next();
 
        if (senha.length() >= 8) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida");
        }

        // RESOLUÇÃO ATV. 1:



        //ATIVIDADE 2
        List<String> contatos = new ArrayList<String>(); 

        System.out.println("Digite o seu nome");
        String contato = scanner.next();
        contatos.add(contato);
        
        for (String name : contatos) {
            System.out.println(name.charAt(0) + "*****");
        }

        //ATIVIDADE 3
        String chave = "@";
        System.out.println("Digite seu email: ");
        String email = scanner.next();
        
        if(email.contains(chave)) {
            System.out.println("Email valido!");
        } else{
            System.out.println("Email invalido");
        }

        //ATIVIDADE 4
        
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        int qtd = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
            qtd++;
            }
        }
        System.out.println(qtd);


        //JEITOS DE DECLARAR STRINGS
        
        // String str1 = "Hello World";
        // String str2 = new String("Hello");

        // System.out.println(str1);
        // System.out.println(str2);

        //Retorna tamanho das Strings
        // System.out.println(str1.length());

        //Retorna o caractere no local específico
        // System.out.println(str1.charAt(4));

        //Retorna a substring dentro da string nos locais especificados
        // System.out.println(str1.substring(1, 3));

        //Retorna a string em maiusculo e minusculo
        // System.out.println(str1.toLowerCase() + str1.toUpperCase());

        //Retorna o index do caractere
        // System.out.println(str1.indexOf("o"));

        //Retorna a string com os valores presentes no indice do replace() trocados
        // System.out.println(str1.replace("e", "a"));

        //Divide a string em objeto de acordo com o indice do split()
        // String[] palavras = str1.split("l");

        //Retorna todos os indices da lista
        // for (String palavra : palavras) {
        //     System.out.println(palavra);
        // }

        //Declara se a variavel A é igual a variavel B
        // Boolean saoIguais = str1.equals(str2);
        // if(saoIguais == true) {
        //     System.out.println("São iguais");
        // }else{
        //     System.out.println("São diferentes");
        // }

        //Declare se a variavel A é igual a B disconsiderando maiusculo ou minusculo
        // Boolean saoIguals = str1.equalsIgnoreCase(str2);
        // if(saoIguals == true) {
        //     System.out.println("São iguais");
        // }else{
        //     System.out.println("São diferentes");
        // }

        //Transforma uma string em um int
        // String str3 = "1234";
        // int number = Integer.parseInt(str3);
        // System.out.println(number);

        //transforma em string
        // Double decimal = 3.14;
        // String pi = Double.toString(decimal);
        // System.out.println(pi);

        //Retirar espaço em branco do começo e meio da string
        // String texto = "   Hello Wolrd ! ";
        // String novoTexto = texto.trim();
        // System.out.println(novoTexto);

        //Retorna um booleano para saber se o documento começa com a string indicada pelo indice da função
        // String filename = "document.txt";
        // boolean startsWithDoc = filename.startsWith("doc");
        // System.out.println(startsWithDoc);

        //Retorna um booleano para saber se o documento termina com a string indicada pelo indice da função
        // boolean endsWithTxt = filename.endsWith("txt");
        // System.out.println(endsWithTxt);
    }
}