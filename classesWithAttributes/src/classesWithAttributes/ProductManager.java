package classesWithAttributes;

public class ProductManager {

	public void Add(Product product) {
		// JDBC ile veritabanına kaydedeceğiz.
		System.out.println("Ürün eklendi: " + product.getName());
	}

	public void Add2(int id, String name, String description, int stockAmount, double price, String renk) {
		// Bu hatalı bir kullanımdır.
	}

}
