package equals;

public class MovieItem {

    private int id;
    private String name;

    MovieItem(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if(!(o instanceof MovieItem)) {
            return false;
        }
        MovieItem other = (MovieItem) o;
        return id == other.id;
    }
}
