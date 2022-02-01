import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Cashier {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		HashMap<String, Integer> coins = new HashMap<String, Integer>();
		Map<String, Integer> Resultcoins = new HashMap<String, Integer>();
		coins.put("q", 25);
		coins.put("dime", 10);
		coins.put("nickle", 5);
		coins.put("penny", 1);
		System.out.println("Please input change");
		Double change = r.nextDouble();
			for (String i : coins.keySet()) {
				int temp = coins.get(i);
				int counter=0;
				while(change>=temp) {
					change=change-temp;
					counter++;
				}
				Resultcoins.put(i, counter);
			}
		r.close();
		System.out.println(Arrays.asList(Resultcoins));
	}
}
