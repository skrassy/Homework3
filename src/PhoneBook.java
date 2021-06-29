import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final Map<String, List<String>> namesAndPhones = new HashMap<>();

    public void add(String name, String phone) {
        List<String> phones = namesAndPhones.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        namesAndPhones.put(name, phones);
    }

    public void getPhone(String name) {
        List<String> phones = namesAndPhones.get(name);
        System.out.println(name + ": " + phones);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "namesAndPhones=" + namesAndPhones +
                '}';
    }
}
