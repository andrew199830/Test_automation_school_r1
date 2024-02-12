package imdb;



import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import org.apache.cassandra.streaming.StreamOut;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class ImdbApi {
    public final ImdbRestClient client = new ImdbRestClient();

    public ResponseBody getTopChartResponse() throws IOException {
        return client.books.getTopChart().execute().body();
    }
    public void getFilmName (ArrayList<Film> films) throws IOException {
        var htmlString = getTopChartResponse().string(); // Get response by top 100
        var document = Jsoup.parse(htmlString);
        var ipcTitleElements = document.select(".ipc-title");
        var index = 0;

        for (Element ipcTitleElement : ipcTitleElements) {
            var aTag = ipcTitleElement.select("a").first();

            if (aTag != null) {
                var href = aTag.attr("href");
                var h3Text = aTag.select("h3").text();
                var link = ImdbRestClient.BASE_URL + href;

                var film = new Film(); //creqte new Film class
                    film.setFilmLink(link); //set link
                    film.setFilmName(h3Text.replaceFirst("^\\d+\\.\\s+", "")); //set Name without number of index
                    films.add(index, film);
                    index++;
            }
        }


    } // method for parcing name and link

    public void getFilmRating (ArrayList<Film> films) throws IOException {
        var htmlString = getTopChartResponse().string();
        var document = Jsoup.parse(htmlString);
        var ratingElements = document.select(".cli-ratings-container");
        var index = 0;

        for (Element ratingElement : ratingElements) {
            var spanTag = ratingElement.select("span").first();

            if (spanTag != null) {
                var rating = spanTag.attr("aria-label");
                var film = films.get(index);
                film.setRating(rating.replaceAll("[^\\d.]", ""));
                films.set(index, film); //update Film class created before
                index++;
            }

        }


    } // method for parcing Rating

    public void getFilmYear (ArrayList<Film> films) throws IOException {
        var htmlString = getTopChartResponse().string();
        var document = Jsoup.parse(htmlString);
        var yearElements = document.select(".cli-children");
        var index = 0;

        for (Element yearElement : yearElements) {
            var spanTag = yearElement.select(".cli-title-metadata").first();

            if (spanTag != null) {
                var year = spanTag.select("span").first().text();
                var film = films.get(index);
                film.setPublicationYear(year);
                films.set(index, film);
                index++;
            }

        }


    }  // method for parcing year



//    public LinkedHashMap<String, String> getTopChart() throws IOException {
//
//            var htmlString = getTopChartResponse().string();
//            var document = Jsoup.parse(htmlString);
//            var ipcTitleElements = document.select(".ipc-title");
//            var ratingElements = document.select(".cli-ratings-container");
//            var ratingList = new ArrayList<String>();
//            var allFilms = new LinkedHashMap<String, String>();
////            Film film = new Film();
//
//
//            for (Element ipcTitleElement : ipcTitleElements) {
//                var aTag = ipcTitleElement.select("a").first();
//
//                if (aTag != null) {
//                    var href = aTag.attr("href");
//                    var h3Text = aTag.select("h3").text();
//                    var link = ImdbRestClient.BASE_URL + href;
////                    film.setFilmLink(link);
////                    film.setFilmName(h3Text);
////                List<String> filmDetails = new ArrayList<>();
////                filmDetails.add(link);
////                allFilms.put(h3Text, link);
//                }
//            }
//
//
//            for (Element ratingElement : ratingElements) {
//                var spanTag = ratingElement.select("span").first();
//
//                if (spanTag != null) {
//                    var rating = spanTag.attr("aria-label");
//                    ratingList.add(rating.replaceAll("[^\\d.]", ""));
////                    film.setRating(rating);
//                }
//
//            }
//            System.out.println(ratingList);
//
//        return allFilms;
//
//    }
//
//    public List<Map.Entry<String, String>> getTop100Films() throws IOException {
//        return new ArrayList<>(getTopChart().entrySet()).stream().limit(100).toList();
//    }
}
