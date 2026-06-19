import animals.Cat;
import utilities.StringJob;

public class Main {


    public static void main(String[] args) {

        try (StringJob stringJob = new StringJob()) {
            String someName = stringJob.createName();
            Cat cat1 = new Cat(someName);
            cat1.action();
            System.out.println(cat1);
        }

        System.out.println("End of app");
    }

}