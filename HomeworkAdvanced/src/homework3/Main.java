package homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> massive = Arrays.asList("студент", "школьник", "учащийся", "студент", "курсант", "кадет", "безработный", "курсант", "сержант", "лейтенант", "курсант");
        Set<String> hashset = new HashSet<>(massive);
        Map<String, Integer> hashmap = new HashMap<>();
        System.out.printf("Уникальные слова:%s%n", hashset);
        for (String x : massive) {
            hashmap.put(x, hashmap.getOrDefault(x,0)+1);
        }
        System.out.printf("Частота повторяющихся:%s%n", hashmap);

        Phonebook book = new Phonebook();
        book.add("Романов", "363487");
        book.add("Иванов", "870977");
        book.add("Романов", "544456");
        book.add("Петров", "877765");
        book.add("Семёнов", "877737");
        book.add("Семёнов", "877733");

        book.get("Романов");
        book.get("Иванов");
        book.get("Петров");
        book.get("Семёнов");
    }
}
