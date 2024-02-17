package collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class ProductTest2 {
	public static void main(String[] args) {
		LinkedList<Product2> product2 = new LinkedList<>();
		product2.add(new Product2("p100", "TV", "20000"));
		product2.add(new Product2("p200", "Computer", "10000"));
		product2.add(new Product2("p100", "MP3", "700"));
		product2.add(new Product2("p300", "Audio", "1000"));
		Collections.sort(product2);
		Collections.reverse(product2);
		System.out.println("\n제품ID      제품명            가격\t\t");
		System.out.println("-------------------------------");
		Iterator<Product2> it = product2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}