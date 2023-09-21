package ITEC2150.Chapter3HW.FarmAnimalHomework;

/**
 * class: MyFarm
 * author: Eden
 * date: 09/21/2023
 * description: tester class for FarmAnimals
 */
import java.util.List;
import java.util.ArrayList;

public class MyFarm {
    public static List<FarmAnimals> animalsList = new ArrayList<FarmAnimals>();
    public static void main(String[] args) {
        Duck ducks1 = new Duck("Donald", "Male", 3.2, 5);
        Duck ducks2 = new Duck("Cheese", "Female", 3.6, 5);
        Cow cow1 = new Cow("Molly", "Female", 1600.0, 3);
        Chicken chick1 = new Chicken("Albert", "Male", 1.6, 2);
        Chicken chick2 = new Chicken("Amelia", "Female", 1.8, 4);
        Chicken chick3 = new Chicken("Dixie", "Female", 1.7, 4);
        //reference declaration

        animalsList.add(ducks1);
        animalsList.add(ducks2);
        animalsList.add(cow1);
        animalsList.add(chick1);
        animalsList.add(chick2);
        animalsList.add(chick3);
        //ArrayList

        for(FarmAnimals animalList: animalsList) {
            System.out.println(animalList);
        }
        System.out.println('\n');
        for (FarmAnimals animalLoadingList: animalsList) {
            System.out.println(animalLoadingList.feedLoadingSchedule());
        }
    }
}
