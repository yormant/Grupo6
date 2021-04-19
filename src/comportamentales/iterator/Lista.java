package comportamentales.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Lista implements ListaSimple {

    LinkedList lista = new LinkedList();

    @Override
    public int count() {
        return lista.size();
    }

    @Override
    public boolean append(Object o) {
        lista.addLast(o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return lista.remove(o);
    }

    @Override
    public Object get(int index) {
        return lista.get(index);
    }

    public Iterator createReverseIterator() {
        return new ReverseIterator(this);
    }
}
