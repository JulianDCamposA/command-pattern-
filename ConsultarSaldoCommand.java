public class ConsultarSaldoCommand implements Command {
    private CuentaBancaria cuenta;

    public ConsultarSaldoCommand(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void ejecutar() {
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }

    public void deshacer() {
        System.out.println("No se puede deshacer consulta de saldo");
    }
}