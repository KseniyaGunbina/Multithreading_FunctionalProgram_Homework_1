import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static List<String> dictionary = new ArrayList<>();

    public static void printDictionary(List<String> list){
        System.out.println("Список всех слов в словаре: ");
        list.stream()
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
