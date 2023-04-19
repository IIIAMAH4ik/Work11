import org.junit.jupiter.api.Test;

public class FilmsTest {
    @Test
    public void testAll() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
    }

    @Test
    public void testLastLess() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
    }

    @Test
    public void testLastEquals() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");
        manager.addFilm("Film X");


        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI",
                "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
    }

    @Test
    public void testLastMore() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");
        manager.addFilm("Film X");
        manager.addFilm("Film XI");
        manager.addFilm("Film XII");


        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI",
                "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
    }

    @Test
    public void testLastRepeat() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film I");


        String[] expected = {"Film I", "Film III", "Film II"};
        String[] actual = manager.findLast();
    }
}
