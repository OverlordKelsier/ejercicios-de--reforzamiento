class Top{
    public Top(String s){
        System.out.println("B ");
        System.out.println(s);}
}
class Bottom2 extends Top{
    public Bottom2(String s){
        super(s);
        System.out.println("D");}

    public static void main(String[] args) {
       new Bottom2("C");
        System.out.println(" ");
    }
// el error marcaba la falta de un constructor en Bottom2

}
