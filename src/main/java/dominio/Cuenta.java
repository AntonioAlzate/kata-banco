package dominio;

import utilidades.ConversorFechas;

import java.io.PrintStream;
import java.time.LocalDate;

public class Cuenta {

    private EstadoCuenta estadoCuenta;

    public Cuenta(){
        estadoCuenta = new EstadoCuenta();
    }

    public Cuenta(EstadoCuenta estadoCuenta){
        this.estadoCuenta = estadoCuenta;
    }

    public void depositar(double monto, String fecha) {
        LocalDate localDate = ConversorFechas.pasarStringToLocalDate(fecha);

        estadoCuenta.registrarDeposito(monto, localDate);
    }

    public void retirar(double monto, String fecha){
        LocalDate localDate = ConversorFechas.pasarStringToLocalDate(fecha);

        estadoCuenta.registrarRetiro(monto, localDate);
    }

    public void imprimirEstadoCuenta(PrintStream out) {
        String representacionEstadoCuenta = this.estadoCuenta.formatearMovimientos();

        out.println(representacionEstadoCuenta);
    }

}
