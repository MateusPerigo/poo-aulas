import java.util.Scanner;

public class ExercicioForSimplesOrdemReversa {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("informe a quantidade de números:");
      int limite = scanner.nextInt();
      scanner.close();

        for (int contador = limite; contador > 1; contador--){
            System.out.print(contador + ",");
           }
        System.out.print(1);
           
    }
}
