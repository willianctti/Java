public class App {
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
    
    public static int mult(int num1, int num2) {
        return num1 * num2;
    }



    public static void main(String[] args) {
        int resultado = soma(1, 1);
        System.out.println("Soma:" + resultado);

        resultado = sub(1, 1);
        System.out.println(resultado);

        resultado = mult(2, 4);
        System.out.println(resultado);

        try {
            resultado = div(6, 2);
            System.out.println("Divisão: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    

}


