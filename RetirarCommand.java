public class RetirarCommand implements Command {
    private CuentaBancaria cuenta;
    private double monto;

    public RetirarCommand(CuentaBancaria cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    public void ejecutar() {
        cuenta.retirar(monto);
    }

    public void deshacer() {
        cuenta.depositar(monto);
    }
}