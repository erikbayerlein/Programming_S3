public class AnObservableCounter implements ObservableCounter {
    int counter = 0;
    ObserverHistory observers = new AnObserverHistory();
    public void add (int amount) {
        counter += amount;
        notifyObservers();
    }
    public int getValue() {
        return counter;
    }
    public void addObserver(CounterObserver observer) {
        observers.addElement(observer);
        observer.update(this);
    }
    public void removeObserver(CounterObserver observer) {
        observers.removeElement(observer);
    }
    void notifyObservers() {
        for (int observerNum = 0; observerNum < observers.size();
             observerNum++)
            observers.elementAt(observerNum).update(this);
    }
}
