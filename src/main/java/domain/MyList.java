package domain;

import java.util.ArrayList;

public class MyList<T>  {
    private ArrayList<T> arrayList;
    private  int index;

    public MyList() {
        arrayList=new ArrayList<>();
    }
    public boolean hasNext(){
        return  arrayList.iterator().hasNext();
    }

    public T next() {
        if (this.hasNext()){
        return  arrayList.get(index);
    }
        return null;
    }

    public void add(T category) {
        arrayList.add(category);
    }
}
