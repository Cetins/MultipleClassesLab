import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getQueueCount() {
        return queue.size();
    }

    public void addPassengerToQueue(Person passenger) {
        queue.add(passenger);
    }

    public Person removePassengerFromQueue(Person passengerToRemove) {
        int index = queue.indexOf(passengerToRemove);
        Person passengerRemoved = queue.get(index);
        queue.remove(index);
        return passengerRemoved;
    }
}
