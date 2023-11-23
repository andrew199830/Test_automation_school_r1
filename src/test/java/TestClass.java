import com.github.javafaker.Faker;
import com.github.javafaker.service.FakerIDN;



public class TestClass {
    public static void main(String[] args) {
        Object InitPhrases = ("Aloha World");
        Object nameOfPerson = Faker.instance().animal().name();
        Object ageOfPerson = Faker.instance().date().birthday(16, 20).toString();
        Object addressOfPerson = Faker.instance().address().fullAddress();
        Object randomfact = Faker.instance().chuckNorris().fact();

        System.out.println(InitPhrases);
        System.out.println("My name is " + nameOfPerson);
        System.out.println("was born at " + ageOfPerson);
        System.out.println("I am living at " + addressOfPerson);
        System.out.println("Do you kow, " + randomfact);

    }
}
