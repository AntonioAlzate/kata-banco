package dominio;

import java.time.LocalDate;

public class Movimiento {

    private LocalDate fecha;
    private double monto;
    private double saldo;
    private TipoTransaccion tipoTransaccion;

    public Movimiento() {

    }

    public void crearMovimientoDeposito(double monto, LocalDate fecha, double saldo){
        this.monto = monto;
        this.fecha = fecha;
        this.saldo = saldo;
        this.tipoTransaccion = TipoTransaccion.DEPOSITO;
    }

    public void crearMovimientoRetiro(double monto, LocalDate fecha, double saldo){
        this.monto = monto;
        this.fecha = fecha;
        this.saldo = saldo;
        this.tipoTransaccion = TipoTransaccion.RETIRO;
    }

    public double montoTipoTransaccion(){
        return tipoTransaccion == TipoTransaccion.DEPOSITO ? monto : -monto;
    }

    @Override
    public String toString() {
        return fecha + "  | " + tipoTransaccion.toString() + "     | "+ monto  + "   | " + saldo;
    }
}
