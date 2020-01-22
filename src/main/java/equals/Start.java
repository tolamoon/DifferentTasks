package equals;

public class Start {

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
