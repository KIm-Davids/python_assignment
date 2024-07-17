package MyCollection;

public class MyArrayList implements MyCollection{

    Object[] myArray = new Object[3];
    private boolean isEmpty = true;
    private int size;

    @Override
    public void add(Object e) {
        myArray[0] = e;
    }

    @Override
    public void remove(Object e) {

    }

    @Override
    public int size() {
        retu;
    }

    @Override
    public Object get(Object e) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer findIndexOf(String element) {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
