import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 2.50;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 2.75;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 1.00;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 3.00;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;

        Order order2 = new Order();
        order2.name = "Jimmy";
        ArrayList<Item>itemList2 = new ArrayList<Item>();
        itemList2.add(item1);
        order2.items = itemList2;
        order2.total = order2.items.get(0).price;
        order2.ready = true;

        Order order3 = new Order();
        order3.name = "Noah";
        ArrayList<Item>itemList3 = new ArrayList<Item>();
        itemList3.add(item4);
        order3.items = itemList3;
        order3.total = order3.items.get(0).price;

        Order order4 = new Order();
        order4.name = "Sam";
        ArrayList<Item>itemList4 = new ArrayList<Item>();
        itemList4.add(item2);
        itemList4.add(item2);
        itemList4.add(item2);
        order4.items = itemList4;
        for (int i =0; i < itemList4.size(); i++){
            order4.total += itemList4.get(i).price;
        }

    
        // Application Simulations
        // Use this example code to test various orders' updates

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}

