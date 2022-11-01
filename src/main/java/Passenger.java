import java.util.UUID;

public class Passenger {
    Title title;
    String name;
    String id;
    String phone;
    int age;

    public Passenger(Title title, String name, String id, String phone, int age){
        this.title = title;
        this.name  = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public Title getTitle() {
        return title;
    }
    public String getName() {
        return name;
    }
    public String getID() {
        return id;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }

    public void setTitle(Title title) {
        if(title == title.Mr || title == title.Mrs || title == title.Ms){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Incorrect Title Prefex ("+ title + ") is not aloud");
        }
    }
    public void setName(String name) {
        if(name.length()>=3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name:"+ name + ") is too short");
        }
    }
    public void setId(String id) {
        if(id.length()>=10){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("ID:"+ id + ") is too short");
        }
    }
    public void setPhone(String phone) {
        if(phone.length()>=10){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone:"+ phone + ") is too short");
        }
    }
    public void setAge(int age) {
        if(age>=16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Age:"+ age + ") is too young");
        }
    }
}
