package comportamentales.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.append(1);
        lista.append(2);
        lista.append(3);
        lista.append(4);
        lista.append(5);

        System.out.println("Lista creada, contiene los elementos: 1, 2, 3, 4, 5.");
        Iterator iter = lista.createReverseIterator();
        System.out.println("Los elementos en orden inverso son:");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
