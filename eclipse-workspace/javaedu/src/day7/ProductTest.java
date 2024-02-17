package day7;
class Product {
	String name;
	int balance;
	int price;
	Product() {
		this("듀크인형", 5, 10000);
	}
	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	int getPrice() {
		return price;
	}
}
public class ProductTest {
	public static void main(String[] args) {
		Product ary[] = new Product[5];
		ary[0] = new Product("또치", 10, 20000);
		ary[1] = new Product("또치2", 11, 20000);
		ary[2] = new Product("또치3", 12, 20000);
		ary[3] = new Product("또치4", 13, 20000);
		ary[4] = new Product("또치5", 14, 20000);
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s\t%s\t%,d원\n", ary[i].getName(), ary[i].getBalance(), ary[i].getPrice());
		}
	}
}