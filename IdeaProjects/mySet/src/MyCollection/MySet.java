package MyCollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class MySet implements MyCollection {

    List<Object> arrays = new ArrayList<>();

    private final boolean isEmpty = true;
    private int size;

    @Override
    public void add(Object e) {
        size++;
        if (!arrays.contains(e)) this.arrays.add(e);
        else size--;
}


    @Override
    public void remove(Object e) {
            if (arrays.contains(e)) {
                size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(Object e) {
       if(arrays.contains(e)) return e;
        return null;
    }

    @Override
    public boolean isEmpty() {
        if(size > 0) return false;
        return isEmpty;
    }

    @Override
    public void clear() {
//        return this.size = 0;
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
