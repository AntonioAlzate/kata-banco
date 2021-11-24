import dominio.Cuenta;
import dominio.EstadoCuenta;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(new EstadoCuenta());
        cuenta.depositar(1000, "10/01/2021");
        cuenta.depositar(2000, "13/01/2021");
        cuenta.retirar(500, "14/01/2021");

        cuenta.imprimirEstadoCuenta(System.out);

    }
}
