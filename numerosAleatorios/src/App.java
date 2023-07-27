import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
      double dado6faces = Math.random() * 5;  
    //   System.out.println(dado6faces);

      Random gerador = new Random();
      int numero = gerador.nextInt(6);
      System.out.println(numero);

      String teste = "alo";
      System.out.println(teste);

    }
}
