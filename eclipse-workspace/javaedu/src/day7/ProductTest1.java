package day7;

class Product1 {
	String name;
	int balance;
	int price;

	Product1() {
		this("듀크인형", 5, 10000);
	}

	Product1(String name, int balance, int price) {
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

public class ProductTest1 {
	public static void main(String[] args) {
		Product1 ary[] = new Product1[5];
		ary[0] = new Product1("또치", 10, 20000);
		ary[1] = new Product1("또치2", 11, 20000);
		ary[2] = new Product1("또치3", 12, 20000);
		ary[3] = new Product1("또치4", 13, 20000);
		ary[4] = new Product1("또치5", 14, 20000);
		for (Product1 p : ary) {
			System.out.printf("%10s%10d%,10d원\n", p.getName(), p.getBalance(), p.getPrice());
		}
//		for (int i = 0; i < 5; i++) {
//			ary[i] = new Product1();
//			System.out.printf("%s\t%s\t%,d원\n", ary[i].getName(), ary[i].getBalance(), ary[i].getPrice());
//		}
	}
}