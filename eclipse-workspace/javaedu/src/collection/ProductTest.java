package collection;
import java.util.HashSet;
import java.util.Iterator;
public class ProductTest {
	public static void main(String[] args) {
		HashSet<Product> products = new HashSet<>();
		boolean[] ary = new boolean[4];
		 ary[0]=products.add(new Product("p100","TV","20000"));
		 ary[1]=products.add(new Product("p200","Computer","10000"));
		 ary[2]=products.add(new Product("p100","MP3","7000"));
		 ary[3]=products.add(new Product("p300","Audio","1000"));
		 for(boolean i : ary) {
			 if(i)  System.out.println("성공적으로 저장되었습니다");
			 else  System.out.println("동일한 ID 의 제품이 이미 저장되어 있습니다.");
		 }
		 Iterator<Product> it = products.iterator();
		 System.out.println("\n제품ID      제품명            가격\t\t");
		 System.out.println("-------------------------------");
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}
}