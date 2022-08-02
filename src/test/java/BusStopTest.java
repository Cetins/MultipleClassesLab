import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop battleFieldStop;
    Person passenger;

    @Before
    public void beforeEach() {
        battleFieldStop = new BusStop("Battlefield");
        passenger = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Battlefield", battleFieldStop.getName());
    }

    @Test
    public void startsWithZeroPassengersInQueue() {
        assertEquals(0, battleFieldStop.getQueueCount());
    }

    @Test
    public void canAddPassengerToQueue() {
        battleFieldStop.addPassengerToQueue(passenger);
        assertEquals(1, battleFieldStop.getQueueCount());
    }

    @Test
    public void canRemovePassengerFromQueue() {
        battleFieldStop.addPassengerToQueue(passenger);
        assertEquals(passenger, battleFieldStop.removePassengerFromQueue(passenger));
    }
}
