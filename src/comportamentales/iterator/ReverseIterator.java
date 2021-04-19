package comportamentales.iterator;

import java.util.Iterator;

public class ReverseIterator implements Iterator {

    protected int actual;

    protected ListaSimple lista;

    @Override
    public boolean hasNext() {
        return (actual > 0);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove()");
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new ArrayIndexOutOfBoundsException("Iterator fuera del limite");
        } else {
            return lista.get(--actual);
        }
    }

    public ReverseIterator(ListaSimple lista) {
        super();
        this.lista = lista;
        actual = lista.count();
    }
}
