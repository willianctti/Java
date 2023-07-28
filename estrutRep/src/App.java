public class App {
    public static void main(String[] args) throws Exception {

      // While (enquanto)   
      int contador = 0;
      while (contador < 5) {
        contador = contador + 1;
        System.out.println("Ola");
        System.out.println(contador);
      }


      // DO while
      do {
        contador = contador + 1;
        System.out.println("Ola");
        System.out.println(contador);
      } while (contador < 5);


      // For
      for(contador = 1; contador < 10; contador++) {
        System.out.println("Ola");
      }

    }
}
