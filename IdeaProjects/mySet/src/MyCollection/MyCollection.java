package MyCollection;

public interface MyCollection {
    void add(Object e);
    void remove(Object e);
    int size();
    Object get(Object e);
    boolean isEmpty();
    void clear();
    Integer findIndexOf(String element);
    int capacity();

}
