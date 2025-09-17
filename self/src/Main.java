class pen{
    String color="blue";

    void prcolor(){
        System.out.println(color);
    }
}
public class Main {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen pen2 = new pen();

        pen1.color="pink";
        pen2.color="black";

        pen1.prcolor();
        pen2.prcolor();

    }
}