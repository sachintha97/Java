package lk.sachintha.casestudy.manager;

import lk.sachintha.casestudy.comparator.IdComparator;
import lk.sachintha.casestudy.pojo.MusicItem;
import lk.sachintha.casestudy.pojo.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class WestminsterMusicStoreManager extends User implements StoreManager {

    public static final int MAX_SIZE = 1000;
    private List<MusicItem> itemList = new ArrayList<MusicItem>();
    private List<MusicItem> soldItem = new ArrayList<MusicItem>();
    private List<MusicItem> boughtItem = new ArrayList<MusicItem>();

    public static void main(String[] args) {
        StoreManager n = new WestminsterMusicStoreManager();
        n.sortItem();
    }

    public  boolean getDetails(){
        System.out.println("hiii");
        return true;
    }
    @Override
    public void addNewItem(MusicItem item) {
        if(itemList.size() < MAX_SIZE){
            itemList.add(item);

        }
        else {
            System.out.printf("Maximum size is attained!!!.......");
        }

    }
    @Override
    public void deleteItem(String itemId) {
        boolean found = false;
        for(MusicItem item : itemList){
            if (item.getItemID().equals(itemId)) {
                itemList.remove(item);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Item not found!!!");
        }
    }

    @Override
    public void printListItem() {

        for(MusicItem item : itemList){
            System.out.println(item);
        }
    }

    @Override
    public void sortItem() {
        //Collections.sort(itemList);
        Collections.sort(itemList, new IdComparator());
    }

    @Override
    public void buyItem() {
        boughtItem.clear();
        Scanner sc = new Scanner(System.in);
        int noItem = sc.nextInt();
        int count = 0;
        while (count < noItem) {
            String itemId = sc.next();
            boolean found = false;
            for (MusicItem item : itemList) {
                if (item.getItemID().equals(itemId)) {
                    boughtItem.add(item);
                    itemList.remove(item);
                    found = true;
                    break;
                }
            }
            if (found) {
                count++;
            }
            else {
                System.out.println("Invalid Item code");
            }
        }
        generateReport();
    }

    @Override
    public void generateReport() {
        File file = new File("boughtItem.txt");
        // resource try - try within try
        try (FileWriter fw = new FileWriter(file , true)){  // true- append
            try (PrintWriter pw = new PrintWriter(fw , true)){ // true - auto flush
                for (MusicItem item : boughtItem){
                    DateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Calendar obj = Calendar.getInstance();
                    pw.println(item.getTitle()+ ":" + item.getItemID() + ":" + item.getPrice() + ":" + dtf.format(obj));
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
