
public class Miscelaneo { /*Aqui iran metodos de utilidad publica por asi decirlo, 
						  como por ejemplo, comprobar si es numerico algo introducido en una ventana*/
	
    public static boolean esNumerico(String cadena) { //Comprobar si el dato es numerico

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
