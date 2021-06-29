import java.util.*;

public class Main {

    public static void main(String[] args) {

        task1StringArray();
        task2PhoneBook();
    }

    public static void task1StringArray() {
        String[] arr = new String[]{
                "Orange", "Apple", "Nut", "Milk",
                "Butter", "Fish", "Apple", "Butter",
                "Fish", "Apple", "Strawberry",
                "Strawberry", "Banana", "Apple",
                "Grape", "Orange", "Banana", "Banana"};
        System.out.println(Arrays.toString(arr));
        Set<String> set = new TreeSet<>(Arrays.asList(arr));
        System.out.println("Список уникальных слов: " + set);
        Map<String, Integer> hashMap = new HashMap<>();
        for (String str : arr) {
            Integer val = hashMap.get(str);
            hashMap.put(str, val == null ? 1 : val + 1);
        }
        hashMap.forEach((k, v) -> System.out.println(k + " = "  + v));
    }

    public static void task2PhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "777");
        phoneBook.add("Petrov", "666");
        phoneBook.add("Ivanov", "111");
        phoneBook.add("Frolov", "222");
        phoneBook.add("Ivanov", "333");
        phoneBook.add("Trusov", "999");
        System.out.println(phoneBook);

        phoneBook.getPhone("Ivanov");
        phoneBook.getPhone("Trusov");
    }

}
