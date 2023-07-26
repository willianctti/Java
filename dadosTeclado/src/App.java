import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int numero;
    //    scanner -> classe
       Scanner leitor = new Scanner(System.in);
       numero = leitor.nextInt();

       System.out.println("Numero é" + numero);
    }
}
