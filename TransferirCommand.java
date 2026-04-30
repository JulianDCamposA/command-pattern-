public class TransferirCommand implements Command {
    private CuentaBancaria origen;
    private CuentaBancaria destino;
    private double monto;

    public TransferirCommand(CuentaBancaria origen, CuentaBancaria destino, double monto) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
    }

    public void ejecutar() {
        origen.transferir(destino, monto);
    }

    public void deshacer() {
        destino.retirar(monto);
        origen.depositar(monto);
    }
}