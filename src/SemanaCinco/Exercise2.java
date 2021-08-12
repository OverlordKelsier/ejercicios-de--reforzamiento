/*
Write a program that computes your initials from your full name and displays them.
 */
public class Exercise2 {
    public static void main(String[] args) {
        String nombreCompleto = "Adolfo Leon Paez";
        String nombre = "adolfo leon paez";
        StringBuffer iniciales = new StringBuffer();
        StringBuffer inicial = new StringBuffer();
        int length = nombreCompleto.length();
        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(nombreCompleto.charAt(i))) {
                iniciales.append(nombreCompleto.charAt(i));
            }
        }
        System.out.println("Las iniciales son: " + iniciales);
        char espacio = ' ';
        if (nombre != null){ inicial.append(nombre.charAt(0));}

        for (int i = 0; i < length; i++) {
            if (nombre.charAt(i) == espacio) {
                inicial.append(nombre.charAt(i+1));
            }
        }
        System.out.println("Las iniciales son: " + inicial);
    }
}
