public class NetDecorator extends Decorator {

    public NetDecorator (Table tableDecorated) {
        super(tableDecorated);
    }

    @Override
    public void decorate() {
        super.decorate();
        addNet();
    }

    private void addNet() {
        System.out.println(" / net was added");
    }
}