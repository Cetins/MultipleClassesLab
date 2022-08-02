import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusTest {
    Bus firstBus;
    Bus fullBus;
    Person passenger;
    Person otherPassenger;
    BusStop sinclair;

    @Before
    public void beforeEach() {
        firstBus = new Bus("Glasgow", 3);
        fullBus = new Bus("Edinburgh", 1);
        passenger = new Person();
        otherPassenger = new Person();
        sinclair =  new BusStop("Sinclair");
    }


    @Test
    public void hasDestination() {
        assertEquals("Glasgow", firstBus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, firstBus.getCapacity());
    }

    @Test
    public void busStartsWithZeroPassengers() {
        assertEquals(0, firstBus.getPassengerCount());
    }

    @Test
    public void canAddPassenger() {
        firstBus.addPassenger(passenger);
        assertEquals(1, firstBus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger() {
        firstBus.removePassenger(passenger);
        assertEquals(0, firstBus.getPassengerCount());
    }

    @Test
    public void cantTakeAnymorePassenger() {
        fullBus.addPassenger(passenger);
        fullBus.addPassenger(otherPassenger);
        assertEquals(1, fullBus.getPassengerCount());
    }

    @Test
    public void canPickUpPassengerFromBusStop() {
        sinclair.addPassengerToQueue(passenger);
        firstBus.pickUp(sinclair, passenger);
        assertEquals(1, firstBus.getPassengerCount());
        assertEquals(0, sinclair.getQueueCount());
    }
}
