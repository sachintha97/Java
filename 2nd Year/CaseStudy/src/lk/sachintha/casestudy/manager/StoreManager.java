package lk.sachintha.casestudy.manager;

import lk.sachintha.casestudy.pojo.MusicItem;

public interface StoreManager {
    // all define method inside interface public abstract methods
    // we can simply start from return type not needed public abstract
    void addNewItem(MusicItem item);
    void deleteItem(String itemId);
    void printListItem();
    void sortItem();
    void buyItem ();
    void generateReport();

}
