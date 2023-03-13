import java.util.Collections;
import java.util.List;

public class SortImpl implements  Sortable{
    @Override
    public void sortByMovieName(List<Movie> movies) {
        Collections.sort(movies,Movie.SortByName);
        Collections.sort(movies,Movie.SortByName2);
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        Collections.sort(movies,Movie.SortByAge);

    }

    @Override
    public void sortByDirector(List<Movie> movies) {
  Collections.sort(movies,Movie.SortByDirec);
    }
}
