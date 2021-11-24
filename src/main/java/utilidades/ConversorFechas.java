package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorFechas {

    public static LocalDate pasarStringToLocalDate(String fecha){
        LocalDate localDate = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return localDate;
    }
}
