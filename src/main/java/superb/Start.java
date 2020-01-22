package superb;

public class Start {
    public static void main(String[] args) {

        Item item = new Item();
        item.setName("Simple Item");
        System.out.println(item.getName());

        Item item2 = new DocumentItem();
        item2.setName("Simple Item");
        System.out.println(item2.getName());
    }
}
