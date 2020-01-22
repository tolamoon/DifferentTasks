package superb;

public class Item {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Super metoda w superklasie");
        return name;
    }
}
