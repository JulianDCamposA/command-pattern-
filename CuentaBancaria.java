public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado: " + monto);
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro realizado: " + monto);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public void transferir(CuentaBancaria destino, double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            destino.depositar(monto);
            System.out.println("Transferencia de " + monto + " realizada");
        } else {
            System.out.println("Fondos insuficientes para transferir");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}