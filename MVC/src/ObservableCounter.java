public interface ObservableCounter {
    public void add (int amount) ;
    public int getValue() ;
    public void addObserver(CounterObserver observer);
    public void removeObserver(CounterObserver observer);
}
