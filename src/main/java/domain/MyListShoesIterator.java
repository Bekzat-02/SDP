package domain;

import domain.models.Category;
import domain.models.Shoes;

public class MyListShoesIterator implements  Iterator{

    private MyList<Shoes> myList;
    @Override
    public boolean hasNext() {
        return myList.hasNext();
    }

    @Override
    public Shoes next() {
        return myList.next();
    }

    public void add(Shoes shoes) {
        myList.add(shoes);
    }
}
