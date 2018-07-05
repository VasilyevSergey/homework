package CustomerImmitation;
import Custom.*;

public class CustomerImitation {

    public static void main(String[] args) {
        Item i1 = new Item("first item");
        Item i2 = new Item("second item");
        Item i3 = new Item("third item");

        Order o = new Order(i1, i2, i3);

        Item i4 = new Item("forth item");
        o.addItem(i4);
        o.showItems();

        System.out.println();
    }

}
