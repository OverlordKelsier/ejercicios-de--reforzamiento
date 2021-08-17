class Gen<T>{
    //T es el parámetro de tipo genérico.
    T ob;
    Gen(T o){
        ob=o;
    }

    T getOb(){
        return ob;
    }

    void mostrarTipo(){
        System.out.println("El tipo de T es: "+ob.getClass().getName());
    }
}

//Clase genérica
class Genericos {
    public static void main(String[] args) {

        Gen<Integer> iOb;//Crea una referencia Gen para Integers.
        iOb=new Gen<Integer>(28);

        iOb.mostrarTipo();//Muestra el tipo de dato
        int v=iOb.getOb();
        System.out.println("Valor: "+v);
        System.out.println();

        //Se Crea un objeto Gen para Strings.
        Gen<String> strOb=new Gen<String>("Prueba de genéricos");

        strOb.mostrarTipo();

        String str=strOb.getOb();
        System.out.println("Valor: "+str);
    }
}
