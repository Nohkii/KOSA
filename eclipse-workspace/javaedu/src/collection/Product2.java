package collection;
import java.util.Objects;
public class Product2 implements Comparable<Product2> {
	private String productID;
	private String productName;
	private String productPrice;
	Product2() {
	}
	Product2(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public int compareTo(Product2 o) { // 여기서 바꿔두면 reverse할 필요 없음(+1, 0, -1)
		if (Integer.parseInt(productPrice) < Integer.parseInt(o.productPrice))
			return -1;
		else if (Integer.parseInt(productPrice) == Integer.parseInt(o.productPrice))
			return 0;
		else
			return 1;
	}
	public String toString() {
		return String.format("%s\t\t%-10s\t%,d원", productID, productName, Integer.parseInt(productPrice)); 
	}
	@Override
	public int hashCode() {
		return Objects.hash(productID, productName, productPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product2 other = (Product2) obj;
		return Objects.equals(productID, other.productID) && Objects.equals(productName, other.productName)
				&& Objects.equals(productPrice, other.productPrice);
	}
}