package HomeworkTestNG;


import Pages.TranslatePage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class TranslatorTest {
    @DataProvider(name = "languageData")
        public Object[][] createLanguageData() {
            return new Object[][] {
                    {"Я круто вивчу TestNG.", "cs", "Budu studovat testng cool."},
                    {"Я круто вивчу TestNG.", "ga", "Déanfaidh mé staidéar ar Testng Cool."},
                    {"Я круто вивчу TestNG.", "fr", "Je vais étudier le test."},
                    {"Я круто вивчу TestNG.", "bg", "Ще проуча Testng Cool."},
                    {"Я круто вивчу TestNG.", "be", "Я вывучу testng крута."},
                    {"Я круто вивчу TestNG.", "et", "Uurin testi jahedat."},
                    {"Я круто вивчу TestNG.", "la", "Et studere testng frigus."},
                    {"Я круто вивчу TestNG.", "es", "Estudiaré testng genial."},
                    {"Я круто вивчу TestNG.", "af", "Ek studeer testng cool."},
                    {"Я круто вивчу TestNG.", "en", "I'll study TESTNG cool."},
                    {"Я круто вивчу TestNG.", "eo", "Mi studos testng malvarmeta."},
                    {"Я круто вивчу TestNG.", "pt", "Vou estudar testng legal."},
                    {"Я круто вивчу TestNG.", "lv", "Es studēšu testng atdzist."},
                    {"Я круто вивчу TestNG.", "pl", "Badam testng fajnie."},
                    {"Я круто вивчу TestNG.", "uz", "Men testni o'rganaman."},
                    {"Я круто вивчу TestNG.", "sv", "Jag studerar testng cool."},
                    {"Я круто вивчу TestNG.", "tr", "Testng serin çalışacağım."},
                    {"Я круто вивчу TestNG.", "nl", "Ik zal testng cool studeren."},
                    {"Я круто вивчу TestNG.", "it", "Studierò Testng Cool."},
                    {"Я круто вивчу TestNG.", "kk", "Мен сынақтан өткіземін."},
                    {"Я круто вивчу TestNG.", "el", "Θα μελετήσω το testng cool."}
            };
        }


        @Test(dataProvider = "languageData")
            public void testTranslation(String originalText, String targetLangCode, String expectedTranslation) {
                Selenide.open(TranslatePage.urlWithLanguages + targetLangCode); // Open page with lang config
                TranslatePage.translaTextInput.setValue(originalText); // Set original text
                Selenide.sleep(10000); // Wait for translate
                TranslatePage.translateTextOutput.shouldHave(text(expectedTranslation));

       }
    }


