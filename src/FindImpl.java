import java.util.List;
import java.util.Scanner;

public class FindImpl implements Findable {
    Scanner scanner=new Scanner(System.in);
    public FindImpl() {
    }
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        movies.forEach(System.out::println);
        return movies;
        }



    @Override
    public void findMovieByName(List<Movie> movies) {
        for (Movie findByMove:movies) {
            if(findByMove.getName().equals(scanner.next().toUpperCase())){
                System.out.println(findByMove);
            }
        }

    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        for (Movie actor:movies) {
            for (Cast cast: actor.getCast()) {
              if(actor.getName().equals(scanner.next())){
                  System.out.println(actor.getCast());
              }
            }

        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        for (Movie yearMovie:movies) {
            if(yearMovie.getYear()==scanner.nextInt()){
                System.out.println(yearMovie);
            }
        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        for (Movie direc:movies) {
            if(direc.getDirector().getName().equals(scanner.next())||direc.getDirector().getLastName().equals(scanner.next())){
                System.out.println(direc);
            }
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        for (Movie des:movies) {
            if(des.getDescription().equals(scanner.next())){
                System.out.println(des);
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        for (Movie role:movies) {
          if(role.getCast().get(0).getRole().equals(scanner.next())){
              System.out.println(role);
            }
        }

    }
}
