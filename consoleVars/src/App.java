public class App {
    public static void main(String[] args) throws Exception {
       String filme = "Vingadores";
       int anoLancmento = 2015; 
       int duracao = 240;
       double nota = 8.5;
       
       System.out.println(filme);
       System.out.println(anoLancmento);
       System.out.println(duracao);
       System.out.println(nota);

       System.out.println("O filme " + filme);
       System.out.format("O filme %s ", filme);

       System.err.println(filme);
    }
}
