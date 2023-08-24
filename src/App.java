import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // ATIVIDADE 1

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        int numerador = ler.nextInt();

        System.out.println("Digite o denominador: ");
        int denominador = ler.nextInt();

        System.out.println("Digite a operação que você deseja(+, -, /, *): ");
        char operacao = ler.next().charAt(0);
        
        if (operacao == '+') {
            System.out.println("A soma dos números é: "+ (numerador + denominador));
        }else if (operacao == '-') {
            System.out.println("A subtração dos números é: "+ (numerador - denominador));
        }else if (operacao == '/') {
            System.out.println("A subtração dos números é: "+ (numerador / denominador));
        }else if (operacao == '*') {
            System.out.println("A subtração dos números é: "+ (numerador * denominador));
        }else {
            System.out.println("Selecione uma operação válida");
        }

        // ATIVIDADE 2

        Scanner contar = new Scanner(System.in);

        System.out.println("Digite um número para fazermos a contagem regressiva: ");
        int number;
        for (number = contar.nextInt(); number >= 1; number--) {
            System.out.println("Número: "+ number);
        }




        // int idade = 12;

        // if(idade >= 18){
        //     System.out.println("Maior de idade");
        // }else{
        //     System.out.println("Menor de idade");
        // }

        // int diaSemana = 9;

        // if (diaSemana == 1){
        //     System.out.println("Segunda-feira");
        // }else if (diaSemana == 2) {
        //     System.out.println("Terça-feira");
        // }else if (diaSemana == 3) {
        //     System.out.println("Quarta-feira");
        // }else if (diaSemana == 4) {
        //     System.out.println("Quinta-feira");
        // }else if (diaSemana == 5) {
        //     System.out.println("Sexta-feira");
        // }else if (diaSemana == 6) {
        //     System.out.println("Sabado");
        // }else if (diaSemana == 7){
        //     System.out.println("Domingo");
        // }else {
        //     System.out.println("Outra semana");
        // }

        // switch (diaSemana) {
        //     case 1:
        //         System.out.println("Segunda-feira");
        //         break;
        //     case 2:
        //         System.out.println("Terça-feira");
        //         break;
        //     case 3:
        //         System.out.println("Quarta-feira");
        //         break;
        //     case 4:
        //         System.out.println("Quinta-feira");
        //         break;
        //     case 5:
        //         System.out.println("Sexta-feira");
        //         break;
        //     case 6:
        //         System.out.println("Sabádo");
        //         break;
        //     case 7:
        //         System.out.println("Domingo");
        //         break;
        //     default:
        //         System.out.println("Outra semana");
        // }

        // for (int i =100; i <= 200; i++) {
        //     System.out.println("Número: " + i);
        // }

        // for (int i =200; i >= 100; i--) {
        //     System.out.println("Número: " + i);
        // }

        // int i = 100;

        // while(i <=200) {
        //     System.out.println("Número: " + i);

        //     i++;
        // }

        // int idade = 0;

        // do {
        //     Scanner ler = new Scanner(System.in);
        //     System.out.println("Digite sua idade: ");

        //     idade = ler.nextInt();
        // }while (idade == 0);
        // System.out.println("Sua idade é: "+ idade);

        // for (int i = 0; i<10; i++){
        //     if(i == 5){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // for (int i = 0; i<10; i++){
        //     if(i == 5){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        
    }
}