package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstadoCuenta {

    private List<Movimiento> movimientos;

    public EstadoCuenta() {
        movimientos = new ArrayList<>();
    }

    public void registrarDeposito(double monto, LocalDate fecha){
        Movimiento movimiento = new Movimiento();

        double saldo = calcularSaldo(monto, TipoTransaccion.DEPOSITO);

        movimiento.crearMovimientoDeposito(monto, fecha, saldo);
        movimientos.add(movimiento);
    }

    public void registrarRetiro(double monto, LocalDate fecha){
        Movimiento movimiento = new Movimiento();

        double saldo = calcularSaldo(monto, TipoTransaccion.RETIRO);

        movimiento.crearMovimientoRetiro(monto, fecha, saldo);
        movimientos.add(movimiento);
    }

    private double calcularSaldo(double monto, TipoTransaccion tipoTransaccion){
        double saldo = 0;


        for (int i = 0; i < movimientos.size(); i++) {
            saldo += movimientos.get(i).montoTipoTransaccion();
        }

        saldo += tipoTransaccion == TipoTransaccion.DEPOSITO ? monto : - monto;

        return saldo;
    }

    public String formatearMovimientos() {
        String estadoMovimientos = "fecha       | Transacción  |  Monto   | balance\n";

        for (int i = 0; i < movimientos.size(); i++) {
            estadoMovimientos += movimientos.get(i).toString() + "\n";
        }

        return estadoMovimientos;
    }
}
