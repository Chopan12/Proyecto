
public class Miscelaneo {
	
    public static boolean esNumerico(String cadena) { //Comprobar si un metodo es numerico

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
}
