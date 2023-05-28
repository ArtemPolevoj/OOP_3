package Task1;

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age, Owner owner) {
        setName(name);
        setAge(age);
        this.owner = owner;
    }

    public Cat() {
        this("", 0, new Owner());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) this.name = "undefined";
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
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Task1.Cat{" +
                "name=" + name +
                ", age=" + age +
                ", owner=" + owner.getName() +
                '}';
    }

    public void greet() {
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s",
                getName(), getAge(), owner.getName());
    }
}

