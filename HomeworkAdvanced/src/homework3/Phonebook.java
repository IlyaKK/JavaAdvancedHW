package homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Phonebook {
    private HashMap<String, LinkedHashSet<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String name, String phoneNew){
        LinkedHashSet<String> phone = phonebook.getOrDefault(name, new LinkedHashSet<>());
        phone.add(phoneNew);
        phonebook.put(name, phone);
    }

    public void get(String name){
        System.out.println("Фамилия: " + name + ", телефон(телефоны): " + phonebook.get(name));
    }
}
