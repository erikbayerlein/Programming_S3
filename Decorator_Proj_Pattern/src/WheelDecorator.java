public class WheelDecorator extends Decorator {

    public WheelDecorator (Table tableDecorated) {
        super(tableDecorated);
    }

    @Override
    public void decorate() {
        super.decorate();
        addWheel();
    }

    private void addWheel() {
        System.out.println(" / wheels were added");
    }

}