import java.util.*;

public class Aula03 {
    public static void main(String[] args) throws Exception {
        //RESUMOS -----------------------------------------------------
        // COMO DECLARAR ARRAY: TipoDoElemento[] nomeDoArray = new TipoDoElemento[TamanhoDoElemento];

        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;

        //COMO VISUALIZAR UM ARRAY(SOUT COM O INDICE || PERCORRER A LISTA)
        System.out.println(numeros[0]);

        for (int numero : numeros){
            System.out.println(numero);
        }

        //LISTAS SÃO ARRAYS QUE N PRECISAM DE TAMANHO FIXO (IMPORTAR PRIMEIRO) 
        // COMO DECLARAR: List<TipoDoElemento> nomeDaLista = new ArrayList<>();

        List<String> nomes = new ArrayList<>();

        nomes.add("Albérico");
        nomes.add("Eduardo");
        nomes.add("Alves");

        //COMO VISUALIZAR UMA LISTA:

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println(nomes);

        //LISTA DE ALTURAS DE PESSOAS (COM SCANNER):

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");    
        Double altura = 0.0;

        List<Double> alturas = new ArrayList<>();

        // for(int i =0; i < 5; i++) {
        //     altura = scan.nextDouble();  
        //     alturas.add(altura);
        // }       

        System.out.println(alturas);

        //METODOS PRONTOS EM LISTAS (.add, .remove, .clear)

        List<String> cores = new ArrayList<>();

        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Verde");
        
        cores.remove(0);
        cores.remove(1);

        cores.clear();

        //CHECAR TAMANHO DE UMA LISTA
        List<Double> tamanhos = new ArrayList<>();

        tamanhos.add(10.2);
        tamanhos.add(20.5);

        int tamanhoDaLista = tamanhos.size();

        System.out.println(tamanhoDaLista);
    }
}