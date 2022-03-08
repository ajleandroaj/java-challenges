/**
 * Description:
 * 3. Create a Java Singleton class
 * The singleton pattern is a design pattern that restricts the instantiation of an object to only one instance. To do this, you’ll need to create a Singleton class that has a non-parameterized constructor.
 * <p>
 * The class should have one public variable called str. It should also have a static method called getSingleInstance that’ll return the single instance of the class.
 */
public class Challenge3 {
    private static Challenge3 instance;
    public String str;

    private Challenge3() {

    }

    public static Challenge3 getSingleInstance() {
        if (instance == null) {
            instance = new Challenge3();
        }

        return instance;
    }
}
