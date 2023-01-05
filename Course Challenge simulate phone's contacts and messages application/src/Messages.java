import java.util.ArrayList;

public class Messages{
    private String name;
    private int contact;
    private static int id;
    private ArrayList<String> messages;
    
    public Messages(String name, int contact, int id) {
        this.name = name;
        this.contact = contact;
        this.id = id;
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
        System.out.println("messages: "+ messages);
    }
    
}