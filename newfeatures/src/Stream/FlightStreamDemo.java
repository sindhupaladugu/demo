package Stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {
	public static void main(String[] args) throws Exception {
		List<Flight> flight = null;

		Stream<String> lines = Files.lines(Paths.get("src/flights.txt"));
		flight = lines.map(l -> {
			String[] a = l.split(",");
			return new Flight(Integer.parseInt(a[0]), a[1], a[2], a[3]);
		}).collect(Collectors.toList());
		flight.forEach(System.out::println);
		// print details of flight no 123
		
				Iterable<Flight> flights;
				flight.forEach(k -> {
					if(k.getCode()==123){
						System.out.println(k);}});
				
				//print all flights of jet carrier
				flight.forEach(k ->{
					if(k.getCarrier().equals("Jet")) {
						System.out.println(k);
					}
				});
				
				//print flight by their route
				flight.forEach(k ->{
					if(k.getSource().equals("Hyderabad")) {
						System.out.println(k);
					}
				});
		
	}
}
