class AgedP {
    //AgedP(){}
    public AgedP(int x){

        System.out.println("AgedP");
        System.out.println(x);}
}
class Kinder extends AgedP {
    public Kinder(int x) {
        //super();
        super(x);

        System.out.println("Kinder");
    }

    public static void main(String[] args) {
        new Kinder(1);
        System.out.println(" ");
    }
}