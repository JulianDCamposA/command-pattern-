import java.util.ArrayList;
import java.util.List;

public class CajeroAutomatico {
    private List<Command> historial = new ArrayList<>();

    public void ejecutarComando(Command comando) {
        comando.ejecutar();
        historial.add(comando);
    }

    public void deshacerUltimo() {
        if (!historial.isEmpty()) {
            Command comando = historial.remove(historial.size() - 1);
            comando.deshacer();
        }
    }
}