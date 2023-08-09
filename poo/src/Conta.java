public class Conta {
    // saldo, agencia, numero e titular

    double saldo;
    int agencia;
    int numero;
    String titular;



    public void deposita(double valor) {
        saldo = saldo + valor;
    }
}
