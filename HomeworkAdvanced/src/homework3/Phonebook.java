package homework3;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    private HashMap<String, HashSet<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String name, String phoneNew){
        HashSet<String> phone = phonebook.getOrDefault(name, new HashSet<>());
        phone.add(phoneNew);
        phonebook.put(name, phone);
    }

    public void get(String name){
        System.out.println("Фамилия: " + name + ", телефон(телефоны): " + phonebook.get(name));
    }
}
