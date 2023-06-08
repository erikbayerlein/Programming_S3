public class Main {
    public static void main(String[] args) {

        VisualComponent t1 = new Table();

        t1 = new WheelDecorator((Table) t1);

        t1.decorate();
    }
}