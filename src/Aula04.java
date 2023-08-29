import java.util.*;

public class Aula04 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        //ATIVIDADE 01

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int menor = 100000;

        for (int number : numbers){
            if (number < menor){
                menor = number;
            }
        }
        System.out.println(menor);

        // //ATIVIDADE 02

        System.out.println("Escolha um número: ");
        int numero = scan.nextInt();

        System.out.println("Escolha um indice: ");
        int indice = scan.nextInt();

        numbers.add(indice, numero);
        System.out.println(numbers);

        //ATIVIDADE 03

        Collections.shuffle(numbers);

        System.out.println(numbers);

        //ATIVIDADE 04

        List<Integer> intersec = new ArrayList<>();

        int[] list1 = new int[5]; 
        int[] list2 = new int[5];

        list1[0] = 1;
        list1[1] = 2;
        list1[2] = 3;
        list1[3] = 4;
        list1[4] = 5;
        list2[0] = 3;
        list2[1] = 4;
        list2[2] = 5;
        list2[3] = 6;
        list2[4] = 7;

        for (int num : list1){
            for (int numb : list2){
                if (num == numb){
                    intersec.add(num); 
                }
            }
        }

        System.out.println(intersec);

        //ATIVIDADE 05

        double[] doubles = new double[5];
        double maxDoubles = 0;

        doubles[0] = 2.3;
        doubles[1] = 5.3;
        doubles[2] = 84.9;
        doubles[3] = 12.07;
        doubles[4] = 90.8;

        for (double k : doubles) {
            maxDoubles += k;
        } 

        System.out.println(maxDoubles / 5);

        //ATIVIDADE 06

        List<Integer> pares = new ArrayList<>();
        
        for (int l : list1){
            if (l % 2 == 0){
                pares.add(l);
            }
        }

        System.out.println(pares);

        //ATIVIDADE 07

        List<Integer> FinalList = new ArrayList<>();
        List<Integer> MenorQueTres = new ArrayList<>();
        List<Integer> MaiorQueTres = new ArrayList<>();

        FinalList.add(1);
        FinalList.add(2);
        FinalList.add(3);
        FinalList.add(4);
        FinalList.add(5);
        FinalList.add(6);



        for (int n : FinalList){
            if (n < 3){
                MenorQueTres.add(n);
            } else {
                MaiorQueTres.add(n);
            }
        }

        System.out.println("Listas alteradas (3): ");
        System.out.println(FinalList);
        System.out.println(MenorQueTres);
        System.out.println(MaiorQueTres);
    }
}
