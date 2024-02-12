package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class TranslatePage
    {
        public static String baseUrl = "https://translate.google.com/"; //base url
        public static String urlWithLanguages = baseUrl + "?sl=auto&tl="; // Url with lang config

        public static SelenideElement translaTextInput = Selenide.$x("//textarea"); // Input text
        public static SelenideElement translateTextOutput = Selenide.$x("//div[@dir=\"ltr\"]/span[@lang]//span"); //output translated text



}
