package Task1;

public class Owner implements IOwner, IGoes{
    private String name;

    public Owner() {
        setName("");
    }

    public Owner(String name) {
        setName(name);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        if (name.equals("")) this.name = "none";
        else this.name = name;
    }

    @Override
    public String info() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void goes() {
        System.out.println("Владелец идет.");
    }
}
