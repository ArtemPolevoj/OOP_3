package Task1;

public class Owner {
    private String name;

    public Owner() {
        this.name = "undefined";
    }

    public Owner(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) this.name = "undefined";
        else this.name = name;
    }

    @Override
    public String toString() {
        return "Task1.Owner{" +
                "name='" + name + '\'' +
                '}';
    }
}
