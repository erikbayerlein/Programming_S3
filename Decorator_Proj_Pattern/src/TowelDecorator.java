public class TowelDecorator extends Decorator {

    TowelDecorator (Table tableDecorated) {
        super(tableDecorated);
    }

    @Override
    public void decorate() {
        super.decorate();
        addTowel();
    }

    private void addTowel() {
        System.out.println(" / towel was added");
    }
}
