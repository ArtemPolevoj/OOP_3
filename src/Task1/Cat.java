package Task1;

public class Cat implements ICat, IGoes {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age, Owner owner) {
        setName(name);
        setAge(age);
        setOwner(owner);
    }

    public Cat() {
        this("", 0, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) this.name = "none";
        else this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        if (owner == null) this.owner = new Owner();
        else this.owner = owner;
    }

@Override
    public void greet() {
        System.out.printf("Мяу! Меня зовут %s." +
                        " Мне %d года(лет)." +
                        " Мой владелец - %s.\n",
                getName(), getAge(), getOwner().getName());
    }

    @Override
    public void goes() {
        System.out.println("Кот идет.");
    }
}

