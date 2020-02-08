package lk.sachintha.casestudy.comparator;

import lk.sachintha.casestudy.pojo.MusicItem;

import java.util.Comparator;

public class IdComparator implements Comparator <MusicItem>{

    public int compare(MusicItem o1 , MusicItem o2){
        return o1.getItemID().compareTo(o2.getItemID());
    }
}
