package collection;

import java.util.Objects;

public class Product {
	private String productID;
	private String productName;
	private String productPrice;

	Product() {
	}

	Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productID, other.productID);
	}

	public String toString() {
		return productID + "\t\t" + productName + "\t\t" + productPrice + "\n";
	}
}