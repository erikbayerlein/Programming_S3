public class ACounterController implements CounterController {
    ObservableCounter counter;
    public void setModel(ObservableCounter theCounter) {
        counter = theCounter;
    }
    public void processInput() {
        while (true) {
            int nextInput = Console.readInt();
            if (nextInput == 0) break;
            counter.add(nextInput);
        }
    }
}
