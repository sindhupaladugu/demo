package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondStreamDemo {

	public static void main(String[] args) {
		List<String> basket=Arrays.asList("Apple","samsung","poco");
		basket.forEach(System.out::println);
		basket.stream().sorted().forEach(System.out::println);
		basket.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		basket.stream().filter(s -> s.contains("a")).forEach(System.out::println);
		System.out.println(basket.stream().filter(s -> s.contains("a")).count());
		Stream.of("sindhu","chow","sja","anhsirk").sorted().forEach(System.out::println);
	}
}
