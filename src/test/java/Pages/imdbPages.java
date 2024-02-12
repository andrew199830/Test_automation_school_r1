package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class imdbPages {
    public static SelenideElement Name = Selenide.$x("[data-testid=\"hero__primary-text\"]");
    public static SelenideElement Year = Selenide.$x("//h1[@data-testid=\"hero__pageTitle\"]/following-sibling::ul/child::li/child::a");
    public static SelenideElement Rating = Selenide.$x("//div[@data-testid=\"hero-rating-bar__aggregate-rating__score\"]/child::span");

}
