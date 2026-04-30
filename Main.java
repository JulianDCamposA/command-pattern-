public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria", 500);

        CajeroAutomatico cajero = new CajeroAutomatico();

        cajero.ejecutarComando(new DepositarCommand(cuenta1, 200));
        cajero.ejecutarComando(new RetirarCommand(cuenta1, 100));
        cajero.ejecutarComando(new TransferirCommand(cuenta1, cuenta2, 300));
        cajero.ejecutarComando(new ConsultarSaldoCommand(cuenta1));

        cajero.deshacerUltimo();
    }
}