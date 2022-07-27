import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static Set<String> dictionary = new HashSet<>();

    public static void printDictionary(Set<String> set){
        System.out.println("Список всех слов в словаре: ");
        set.stream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Слова местного жителя: ");
        String line = scanner.nextLine();
        dictionary.addAll(Arrays.stream(line.split(" "))
                .sorted()
                .collect(Collectors.toList()));
        System.out.println("Словарь дополнен. Всего слов: " + dictionary.size());

        printDictionary(dictionary);
    }
}
