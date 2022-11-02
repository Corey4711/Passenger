import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerTest {
    Passenger passenger;


    @BeforeEach
    void setUp() {
        passenger = new Passenger(null,null,null,null,0);
    }

    @Test
    void passengerSuccess(){
        passenger.setPassenger(Title.Mr,"John","1234567890","1234567",21);
        passenger.setPassenger(Title.Mrs,"Jane","0987654321","7654321",23);
        passenger.setPassenger(Title.Ms,"Tommy","4259635417","2759634",16);

        assertEquals(3,passenger.TicketList.size());
    }

    @Test
    void titleFail(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->{
            passenger.setPassenger(null,"John","1234567890","1234567",21);
        });
        assertEquals(thrown.getMessage(),"Incorrect Title Prefix is not aloud");
        assertEquals(0,passenger.TicketList.size());
    }
    @Test
    void nameFail(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->{
            passenger.setPassenger(Title.Mr,"PJ","1234567890","1234567",21);
        });
        assertEquals(thrown.getMessage(),"Name is too short");
        assertEquals(0,passenger.TicketList.size());
    }
    @Test
    void idFail(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->{
            passenger.setPassenger(Title.Mr,"John","1234","1234567",21);
        });
        assertEquals(thrown.getMessage(),"ID is too short");
        assertEquals(0,passenger.TicketList.size());
    }
    @Test
    void phoneFail(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->{
            passenger.setPassenger(Title.Mr,"John","1234567890","999",21);
        });
        assertEquals(thrown.getMessage(),"Phone number is too short");
        assertEquals(0,passenger.TicketList.size());
    }
    @Test
    void ageFail(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->{
            passenger.setPassenger(Title.Mr,"John","1234567890","1234567",12);
        });
        assertEquals(thrown.getMessage(),"Age is too young");
        assertEquals(0,passenger.TicketList.size());
    }
}
