package HomeworkTestNG;

import Pages.imdbPages;

import com.codeborne.selenide.Selenide;
import imdb.Film;
import imdb.ImdbApi;

import imdb.ImdbRestClient;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.text;

public class imdbTop100Test {
    private final ImdbApi ImdbApi = new ImdbApi();
    private final ArrayList<Film> films = new ArrayList<>();

    @DataProvider(name = "filmData")
    public Object[][] createFilmData() throws IOException {


        ImdbApi.getFilmName(films); // execute methods for parsing test data
        ImdbApi.getFilmRating(films);
        ImdbApi.getFilmYear(films);
        Object[][] testData = new Object[films.size()][4]; // 4 - це кількість параметрів у Film, які будуть передані в тест

        for (int i = 0; i < films.size(); i++) {
            Film film = films.get(i);
            testData[i][0] = film.getFilmName();
            testData[i][1] = film.getFilmLink();
            testData[i][2] = film.getRating();
            testData[i][3] = film.getPublicationYear();
        }
        return testData;

    }

    @Test(dataProvider = "filmData")
    public void filmstest(String TestName, String TestLink, String TestRating, String TestYear) {
        Selenide.open(TestLink);
        imdbPages.Rating.shouldHave(text(TestRating));
        imdbPages.Year.shouldHave(text(TestYear));
        imdbPages.Name.shouldHave(text(TestName));

    }

}
