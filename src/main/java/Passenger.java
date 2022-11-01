import java.util.UUID;

public class Passenger {
    Title title;
    String name;
    int id;
    int phone;
    int age;

    public Passenger(Title title, String name, int id, int phone, int age){
        this.title = title;
        this.name  = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        if(title == title.Mr || title == title.Mrs || title == title.Ms){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Incorrect Title Prefex ("+ title + ") is not aloud");
        }
    }
}
