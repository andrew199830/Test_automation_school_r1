package Lesson7_Homework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //Creating Articles
    public static void main(String[] args) {
        Article<Astrologer> article1 = new Article<>("someId",
                "Article Title", "Article text",
                true, 4, 200,
                100, 1703793742, "vedic");
        article1.putAstrologer(new Astrologer("Mark", "astroId", false));

        Article<Astrologer> article2 = new Article<>("someId",
                "Article Title", "Article text",
                true, 4, 200,
                122, 1703793742, "vedic");
        article2.putAstrologer(new Astrologer("Mark", "astroId", false));

        //Creating List of Articles
        List<Article<Astrologer>> articleListData = new ArrayList<>();
        articleListData.add(article2);
        articleListData.add(article1);



        //Creating responce with list of Articles
        Response<Article<Astrologer>> response = new Response<>();
            response.setData(articleListData);
            response.setPagination(new Response.Pagination(1, 0, 50));

        //SOUT Articles sorted by count of Likes
        Collections.sort(articleListData);
        articleListData.forEach(System.out::println);
        //SOUT Responce Obj
        System.out.println(response);

    }

}
