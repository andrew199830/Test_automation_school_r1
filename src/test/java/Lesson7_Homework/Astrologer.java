package Lesson7_Homework;

public class Astrologer {
    private String name;
    private String astrologerId;
    private Boolean status;

    public Astrologer(String name, String astrologerId, Boolean status) {
        this.name = name;
        this.astrologerId = astrologerId;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAstrologerId() {
        return astrologerId;
    }

    public void setAstrologerId(String astrologerId) {
        this.astrologerId = astrologerId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
