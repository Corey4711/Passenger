import java.util.ArrayList;
import java.util.List;

public class Passenger {
    Title title;
    String name;
    String id;
    String phone;
    int age;

    List<Passenger> TicketList= new ArrayList<>();

    public Passenger(Title title, String name, String id, String phone, int age){
        this.title = title;
        this.name  = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public void setPassenger(Title title, String name, String id, String phone, int age) {
        if(title == title.Mr || title == title.Mrs || title == title.Ms){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Incorrect Title Prefix is not aloud");
        }
        if(name.length()>=3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name is too short");
        }
        if(id.length()>=10){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("ID is too short");
        }
        if(phone.length()>=7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone number is too short");
        }
        if(age>=16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Age is too young");
        }
        TicketList.add(new Passenger(title, name, phone, id, age));
    }

}
