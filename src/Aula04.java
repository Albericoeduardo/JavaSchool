import java.util.*;

public class Aula04 {
    public static void main(String[] args) throws Exception {
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


    }
}
