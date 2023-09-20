import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
        try{
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome:");
        String nome = scan.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scan.next();

        System.out.println("Digite sua idade:");
        Integer idade = scan.nextInt();

        System.out.println("Digite sua altura:");
        Double altura = scan.nextDouble();

        System.out.println("Olá, me chamo "+ nome.toUpperCase()+" "+sobrenome);
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Minha altura é "+ altura+ "cm");
        }catch(InputMismatchException e ){
            System.out.println("Os campos idades e altura precisam ser numericos");
        }
            
        
    }
}
