class PrePostDemo {

    public static void main(String[] args){

        int i = 3;

        i++;

        System.out.println(i);    // "4"

        ++i;

        System.out.println(i);    // "5"

        System.out.println(++i);  // "6"

        System.out.println(i++);  // "6"
// pq primero se imprime la variale al ser el prefijo, posteriormente se incrementa dando a entender que se realiza la operación.
        System.out.println(i);    // "7"

    }

}