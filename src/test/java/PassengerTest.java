import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerTest {
    Passenger passenger;

    @BeforeEach
    void setUp() {
        passenger = new Passenger(null,null,0,0,0);
    }

    @Test
    void titleSuccessMr(){
        passenger.setTitle(Title.Mr);
        assertEquals(Title.Mr,passenger.getTitle());
    }
    @Test
    void titleSuccessMrs(){
        passenger.setTitle(Title.Mrs);
        assertEquals(Title.Mrs,passenger.getTitle());
    }
    @Test
    void titleSuccessMs(){
        passenger.setTitle(Title.Ms);
        assertEquals(Title.Ms,passenger.getTitle());
    }
    @Test
    void titleFail(){
        assertThrows(IllegalArgumentException.class, () ->{passenger.setTitle(null);});
    }
}
