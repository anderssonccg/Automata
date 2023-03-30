
package modelo;

/**
 *
 * @author ANGIE 
 */
public class Automata {

    private String cadena;

    public Automata() {
    }

    public Automata(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public boolean verificarCadena() {
        boolean condicion = this.cadena.equals("") || this.cadena.equals(" ");
        String aux = this.cadena;
        String aux2;
        int i = 0;//cantidad de letras

        if (!condicion) {
            while (i < this.cadena.length() && this.cadena.charAt(i) == 'a') {
                aux = this.cadena.substring(i + 1);
                i++;
            }
            condicion = i % 2 == 0;

            if (condicion) {
                i = 0;
                aux2 = aux;
                while (i < aux.length() && aux.charAt(i) == 'b') {
                    aux2 = aux.substring(i + 1);
                    i++;
                }
                condicion = i % 3 == 0 && aux2.equals("");
            }
        }
        return condicion;
    }

}
