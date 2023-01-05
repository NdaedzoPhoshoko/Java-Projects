import java.util.ArrayList;

public class Contacts {
    private String name;
    private int contact;
    private ArrayList<Messages> messages;
    
    public Contacts(String name, int contact, ArrayList<Messages> messages) {
        this.name = name;
        this.contact = contact;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
    public void display()
    {
        System.out.println("name: "+ getName());
        System.out.println("contact: "+ getContact());
    }
    
}
