public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaWillian = new Conta();

        contaWillian.saldo = 100;
        contaWillian.deposita(50);
        System.out.println(contaWillian.saldo);
    }
}
