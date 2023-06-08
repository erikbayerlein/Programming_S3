public abstract class Decorator implements VisualComponent {

    protected Table decoratedTable;

    public Decorator(Table decoratedTable) {
        this.decoratedTable = decoratedTable;
    }

    public void decorate() {
        decoratedTable.decorate();
    }
}
