package Task1;

public interface ICat {
    void greet();
    default void info(){};
}
