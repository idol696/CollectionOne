import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for(Integer num: nums) {
            if (num % 2 != 0 ) System.out.println(num + " ");
        }

        System.out.println("Задание 2");
        nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numsUnique = new HashSet<>();
        for(Integer num: nums) {
            if (num % 2 != 0 ) numsUnique.add(num);
        }
        System.out.println(numsUnique);

        System.out.println("Задание 3");
        List<String> strings = new ArrayList<>(List.of("Полено", "Чучмек" , "Фенол", "Полено"));
        Set<String> stringsUnique = new HashSet<>(strings);
        System.out.println(stringsUnique);

        System.out.println("Задание 4");
        strings = new ArrayList<>(List.of("Полено", "Чучмек" , "Фенол", "Полено"));
        stringsUnique = new HashSet<>(strings);
        int doubleCount = strings.size() - stringsUnique.size();
        System.out.println("Количество дублей: " + doubleCount);


    }
}