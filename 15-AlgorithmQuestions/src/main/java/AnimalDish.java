import java.util.Arrays;

public class AnimalDish {
    public static void main(String[] args) {

        System.out.println(animalDish("aslan","adddddkkkooon"));

    }

    public static boolean animalDish(String animal, String dish){

        char[] animalLetters = new char[2];
        char[] dishLetters = new char[2];

         animalLetters[0] = animal.charAt(0);
         animalLetters[1] = animal.charAt(animal.length()-1);

       dishLetters[0] = dish.charAt(0);
       dishLetters[1] = dish.charAt(dish.length()-1);

   return Arrays.equals(animalLetters,dishLetters);



    }
}
