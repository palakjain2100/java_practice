import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class basics_of_loops{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
//        for (double i=0;i<15;i+=2){
//            System.out.println(i);
//        }
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("peach");
//        fruits.add("melon");
//        fruits.add("watermelon");
//        int Listsize = fruits.size();
//        String place = fruits.get(4);
//        fruits.set(1,"Green banana");
//        fruits.remove(1);
//        fruits.clear();
//        System.out.println(Listsize);
//        System.out.println(fruits);
//        System.out.println(place);
        Map cars = new HashMap();
        cars.put("BMW",3);
        cars.put("Audi",2);
        cars.put("Mercedes",5);
        cars.put("Honda",7);
        cars.put("Mushtang",1);
        cars.remove("BMW");
        int size = cars.size();
        System.out.println(cars.get("Audi"));
        System.out.println(cars);
        System.out.println(size);



    }
}