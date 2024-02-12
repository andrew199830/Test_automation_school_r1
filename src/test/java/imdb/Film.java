package imdb;

import org.jsoup.select.Elements;

public class Film {
    private String filmName;
    private String rating;
    private String filmLink;
    private String publicationYear;

    public Film(String filmName, String rating, String filmLink, String publicationYear) {
        this.filmName = filmName;
        this.rating = rating;
        this.filmLink = filmLink;
        this.publicationYear = publicationYear;
    }
    public Film() {
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFilmLink() {
        return filmLink;
    }

    public void setFilmLink(String filmLink) {
        this.filmLink = filmLink;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }
}
