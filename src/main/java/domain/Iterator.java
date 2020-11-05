package domain;

import domain.models.Category;
import domain.models.Shoes;

public interface Iterator {
    public  boolean hasNext();
    public Shoes next();
}
