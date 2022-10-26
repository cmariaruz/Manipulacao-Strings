import java.util.ArrayList;
import java.util.Scanner;

public class SelecaoString {

    final static int ITERACOES = 4;

    static String maiorSequeciaAscendente;
    static ArrayList<String> listaSequencias = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer listaStrings = new StringBuffer();

        for (int i = 0; i<ITERACOES;i++){
            System.out.print("Entre uma sequencia de letras: ");
            String sequencia = scanner.next();
            listaStrings.append(sequencia);

        }

        comparaSequencia(listaStrings);
        getMaiorSequeciaAscendente(listaSequencias);

    }

    public static void comparaSequencia(StringBuffer listaStrings){

        String sequenciasAscendentes = listaStrings.substring(0,1);
        for (int i=0; i<listaStrings.length()-1;i++){
            String primeiraLetra = listaStrings.substring(i,i+1);
            String proximaLetra = listaStrings.substring(i+1,i+2);
            int sequenciaAscendente = proximaLetra.compareTo(primeiraLetra);
            if (sequenciaAscendente >0) {
                sequenciasAscendentes = sequenciasAscendentes+proximaLetra;
            }else {
                listaSequencias.add(sequenciasAscendentes);
                sequenciasAscendentes = proximaLetra;
            }
        }
    }

    public static void getMaiorSequeciaAscendente(ArrayList<String> listaSequencias){

        maiorSequeciaAscendente = listaSequencias.get(0);
        for (int i=0;i<listaSequencias.size()-1;i++){
            if (listaSequencias.get(i+1).length() > listaSequencias.get(i).length()){
                maiorSequeciaAscendente = listaSequencias.get(i+1);
            }
        }
        System.out.println("Maior Sequencia:"+maiorSequeciaAscendente);
    }

}

