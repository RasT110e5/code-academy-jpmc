package class_15.stream_optional;

import java.util.*;

public class StreamsAndOptionals {

  private static final List<Integer> numbers = List.of(2, 3, 4, 5, 2);
  private static final List<String> names = Arrays.asList("George", "Akan", "Matt", "Brian", "Chuck");

  public static void main(String[] args) {
//    demonstrateMap();
//    demonstrateFilter();
//    demonstrateSort();
//    demonstrateCollectToDiffCollection();
//    demonstrateForeach();
//    demonstrateReduce();
    demonstrateOptionals();
  }

  private static void demonstrateOptionals() {
//    String nameThatIsSimilarToMack = names.stream()
//        .filter(s -> s.contains("ma") || s.contains("ck"));

    /*
    LoginService loginService = new LoginService();
    String username = Optional.ofNullable(loginService.findUsernameByEmail("roque@sosa.com"))
        .orElse("NaN");
//        .orElseThrow(() -> new SecurityException("Username not found"));
//        .orElseGet(() -> loginService.getDefaultUsername());
    Optional.ofNullable(loginService.findUsernameByEmail("roque@sosa.com"))
        .ifPresent(usr -> loginService.authenticate(usr));
        .ifPresentOrElse(
            usr -> loginService.authenticate(usr),
            () -> {
              throw new SecurityException("Password is incorrect");
            });
     */
  }

  private static void demonstrateReduce() {
    printOriginalNumbers();

    //Without streams
    int even = 0;
    for (Integer number : numbers)
      if (number % 2 == 0)
        even++;

    //Without streams
//    int even = numbers.stream()
//        .filter(x -> x % 2 == 0)
//        .reduce(0, (ans, i) -> ans + 1);

    System.out.println("Q of even numbers:");
    System.out.println(even);
  }

  private static void demonstrateForeach() {
    printOriginalNumbers();

    System.out.println("Squared numbers:");

    //With streams
    for (Integer number : numbers) System.out.println(number * number);

    //With streams
//    numbers.stream().map(x -> x * x).forEach(y -> System.out.println(y));
//    numbers.parallelStream().map(x -> x * x).forEach(y -> System.out.println(y));
  }

  private static void demonstrateCollectToDiffCollection() {
    printOriginalNumbers();

    //Without streams
    Set<Integer> squareSet = new HashSet<>();
    for (Integer number : numbers)
      squareSet.add(number * number);

    //With streams
//    Set<Integer> squareSet = numbers.stream()
//        .map(x -> x * x)
//        .collect(Collectors.toSet());

    System.out.println("Squared and collected into Set<T>:");
    System.out.println(squareSet);
  }

  private static void demonstrateSort() {
    //TODO: explain order vs sort
    printOriginalNames();

    //With streams
    List<String> show = new ArrayList<>(names);
    for (int i = 0; i < show.size(); i++) {
      for (int j = 1; j < (show.size() - i); j++) {
        if (show.get(j - 1).compareTo(show.get(j)) > 0) {
          //swap elements
          String temp = show.get(j - 1);
          show.set(j - 1, show.get(j));
          show.set(j, temp);
        }
      }
    }

    //With streams
//    List<String> show = names.stream()
//        .sorted()
//        .collect(Collectors.toList());
    System.out.println("Sorted: ");
    System.out.println(show);
  }

  private static void demonstrateFilter() {
    printOriginalNames();

    //Without streams
    List<String> result = new ArrayList<>();
    for (String name : names)
      if (name.startsWith("A"))
        result.add(name);

    //With streams
//    List<String> result = names.stream()
//        .filter(s -> startsWithS(s))
//        .collect(Collectors.toList());

    System.out.println("Result after filter:");
    System.out.println(result);
  }

  private static void demonstrateMap() {
    printOriginalNumbers();

    //Without stream
    List<Integer> square = new ArrayList<>();
    for (Integer number : numbers)
      square.add(number * number);

    //With stream
//    List<Integer> square = numbers.stream()
//        .map(x -> x * x)
//        .collect(Collectors.toList());

    System.out.println("Squared:");
    System.out.println(square);
  }

  private static void printOriginalNumbers() {
    System.out.println("Original numbers:");
    System.out.println(numbers);
  }

  private static void printOriginalNames() {
    System.out.println("Original names:");
    System.out.println(names);
  }

}