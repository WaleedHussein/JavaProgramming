package Feb.day52_Map_FunctionalInterface;

@FunctionalInterface
public interface MySecondFunctionalInterface<T> { //this mean it will have a generic type,
    // if you pass int, it will pass int, if you pass a string, it will change to string

    void test(T t);

}
