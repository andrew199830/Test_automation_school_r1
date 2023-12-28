package Lesson7_Homework;


public class Article <T> implements Comparable<Article <T>>{
        private String id;
        private String title;
        private String content;
        private boolean premium;
        private int timeRead;
        private int countComment;
        private int countLikes;
        private long publishedAt; // Unix timestamp
        private String category;
        private T astrologer;

        public void putAstrologer(T astrologer) {
            this.astrologer = astrologer;
        }

        public T getAstrologer(){
            return astrologer;
        }

        public void removeAstrologer() {
            this.astrologer = null;
        }




        //Constructor
        public Article(String id, String title, String content,
                    boolean premium, int timeRead,
                   int countComment, int countLikes,
                   long publishedAt, String category) {

        this.id = id;
        this.title = title;
        this.content = content;
        this.premium = premium;
        this.timeRead = timeRead;
        this.countComment = countComment;
        this.countLikes = countLikes;
        this.publishedAt = publishedAt;
        this.category = category;
    }

    //Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getTimeRead() {
        return timeRead;
    }

    public void setTimeRead(int timeRead) {
        this.timeRead = timeRead;
    }

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public long getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(long publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int compareTo(Article<T> o) {
        return Integer.compare(this.countLikes, o.countLikes);
    }
    @Override
    public String toString() {
            return this.title + ", " + this.id +  ", " + this.countLikes;
    }
}

