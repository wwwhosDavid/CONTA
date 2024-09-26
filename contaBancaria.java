public class contaBancaria {
    private double saldo;
    private int numeroConsultas;

    public contaBancaria() {
        saldo = 0;
        numeroConsultas = 0;
    }

    //Método para calcular taxa de depósito
    public void depositar(double valor) {
        double taxa = valor * 0.01;
        saldo += valor - taxa;
        System.out.println("Depósito realizado com. Saldo atual de: R$" + saldo);
    }

    //Método para a ação de saque
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

    //Método para calcular taxa de saque
        double taxa = valor * 0.005;
        saldo -= valor + taxa;
        System.out.println("Saque realizado com. Saldo atual de: R$" + saldo);
    }

    //Método para consulta de saldo
    public void consultarSaldo() {
        numeroConsultas++;
        if (numeroConsultas % 5 == 0) {
            saldo -= 0.10;
        }
        System.out.println("Seu saldo atual é: R$" + saldo);
    }
}