package Lesson6;

public class Cup {

    private int volume;
    private String color;

    public Cup(int volume, String color) {
        this.volume = volume;
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
