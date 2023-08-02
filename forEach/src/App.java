import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] notas = new int[10];

        Random random = new Random();

        for (int i=0; i<notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        System.out.println("Usando o ForEach");
        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}
