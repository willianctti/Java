public class App {

   public class Circulo {
    double diametro;
    
    public Circulo(double x) {
        diametro = x;
    }
   }

   public static void main(String[] args) {
    // Circulo circ1 = new Circulo();

   }


   public class Carro {
    String marca;
    private String modelo;
    private int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel );
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km/this.consumoCombustivel;
        return qtdCombustivel;
    } 
   }

   public class TesteCarro {
    public void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat"; // Note que "Fiat" deve começar com letra maiúscula
        carro.modelo = "Teste";
        carro.numPassageiros = 12;

        // Exemplo de como chamar os métodos da classe Carro:
        carro.exibirAutonomia();
        double autonomia = carro.obterAutonomia();
        System.out.println("Autonomia obtida: " + autonomia);
        double combustivelNecessario = carro.calcularCombustivel(100);
        System.out.println("Quantidade de combustível necessária para percorrer 100 km: " + combustivelNecessario);
    }
}


 
   }

