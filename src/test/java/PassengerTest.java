import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerTest {
    Passenger passenger;

    @BeforeEach
    void setUp() {
        passenger = new Passenger(null,null,null,null,0);
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

    @Test
    void nameSuccess(){
        passenger.setName("John");
        assertEquals("John",passenger.getName());
    }
    @Test
    void nameFail(){
        assertThrows(IllegalArgumentException.class, () ->{passenger.setName("PJ");});
    }

    @Test
    void idSuccess(){
        passenger.setId("87621687621");
        assertEquals("87621687621",passenger.getID());
    }
    @Test
    void idFail(){
        assertThrows(IllegalArgumentException.class, () ->{passenger.setId("123");});
    }

    @Test
    void phoneSuccess(){
        passenger.setPhone("08668463165");
        assertEquals("08668463165",passenger.getPhone());
    }
    @Test
    void phoneFail(){
        assertThrows(IllegalArgumentException.class, () ->{passenger.setPhone("999");});
    }

    @Test
    void ageSuccess(){
        passenger.setAge(21);
        assertEquals(21,passenger.getAge());
    }
    @Test
    void ageFail(){
        assertThrows(IllegalArgumentException.class, () ->{passenger.setAge(12);});
    }

}
