package equals;

public class MovieItem {

    private int id;
    private String name;

    private MovieItem(int id, String name) {
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

    public static void main(String[] args){

        MovieItem movieItem = new MovieItem(1, "Avatar");
        MovieItem nextMovieItem = new MovieItem(1, "Avatar");

        if(movieItem == nextMovieItem) {
            System.out.println("Operator \"==\", ten sam obiekt");
        } else {
            System.out.println("Operator \"==\", NIE ten sam obiekt");
        }

        if(movieItem.equals(nextMovieItem)) {
            System.out.println("Operator \"equals\", ten sam obiekt");
        } else {
            System.out.println("Operator \"equals\", NIE ten sam obiekt");
        }
    }
}
