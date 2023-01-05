public class Database {
    private String name;
    private static Database instance; //one and only instance for Database

    /**
     * method getInstance is accessed in a static way. Its synchronized to only
     * allow one instance to be made to a class Database
     * @param name
     * @return instance
     */
    public static synchronized Database getInstance(String name)
    {
        if(instance == null)
        {
            instance = new Database(name);
            return instance;
        }else
        {
            return instance;
        }
    }

    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO display information of Database
        String text = "Database class\n"+
            "Name: "+ name;
        return text;
    }

    
}
