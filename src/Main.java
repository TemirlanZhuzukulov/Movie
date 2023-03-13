import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FindImpl find = new FindImpl();
        SortImpl sort = new SortImpl();
        Scanner scanner = new Scanner(System.in);

        Director director1 = new Director("Ruslan", "Akun");
        Director director2 = new Director("Sadyk ", "Sher");
        Director director3 = new Director("Azamat", "Ismailov");

        Cast cast1 = new Cast("Okeana", "Main");
        Cast cast2 = new Cast("Akylay Subanbek", "strongWomen");
        Cast cast3 = new Cast("Aibek", "detective");
        ArrayList<Cast> casts = new ArrayList<>();
        casts.add(cast1);
        casts.add(cast2);
        casts.add(cast3);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Akyrky sabak", 2022, "educational", director1, casts));
        movies.add(new Movie("Kurmanzhan Datka", 2017, "Historical", director2, casts));
        movies.add(new Movie("RAZBOI", 2023, "criminal", director3, casts));
        movies.forEach(System.out::println);


        while (true) {
            System.out.println("""
                    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*
                       Нажмите 1 чтобы увидеть каталог фильмов
                       Нажмите 2 чтобы найти фильм по названию фильма
                       Нажмите 3 чтобы найти фильм по имени актера
                       Нажмите 4 чтобы найти фильм по году выпуска фильма
                       Нажмите 5 чтобы найти фильм по описанию фильма
                       Нажмите 6 чтобы найти фильм по названию роля актера
                       Нажмите 7 чтобы найти фильм по имени директора
                       Нажмите 8 чтобы отсортировать фильм по названию фильма
                       Нажмите 9 чтобы отсортировать фильм по году выпуска фильма
                       Нажмите 10 чтобы отсортировать фильм по имени диретора  фильма
                    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*    
                       """);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println(find.getAllMovies(movies));
                    break;
                case 2:
                    find.findMovieByName(movies);
                    break;
                case 3:
                    find.findMovieByActorName(movies);
                    break;
                case 4:
                    find.findMovieByYear(movies);
                    break;
                case 5:
                    find.findMovieByDescription(movies);
                    break;
                case 6:
                    find.findMovieByRole(movies);
                    break;
                case 7:
                    find.findMovieByDirector(movies);
                    break;
                case 8:
                    sort.sortByMovieName(movies);
                    break;
                case 9:
                    sort.sortByYear(movies);
                    break;
                case 10:
                    sort.sortByDirector(movies);

            }
        }
    }
}