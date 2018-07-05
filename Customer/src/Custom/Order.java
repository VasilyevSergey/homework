package Custom;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> itemList = new ArrayList<Item>();

    public Order(){
    }

    public Order(Item item, Item... items) {
        itemList.add(item);
        if (items.length != 0) {
            for (int i = 0; i < items.length; i++) {
                itemList.add(items[i]);
            }
        }
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void showItems(){
        String currentItemList = "";
        for (int i = 0; i < itemList.size(); i++) {
            currentItemList +=  itemList.get(i).getName() + " ";
        }
        System.out.println(currentItemList);
    }
}
