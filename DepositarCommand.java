public class DepositarCommand implements Command {
    private CuentaBancaria cuenta;
    private double monto;

    public DepositarCommand(CuentaBancaria cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    public void ejecutar() {
        cuenta.depositar(monto);
    }

    public void deshacer() {
        cuenta.retirar(monto);
    }
}