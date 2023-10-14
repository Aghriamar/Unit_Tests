package seminars.first.Homework;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.first.Shop.Product;
import seminars.first.Shop.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    private Shop shop;
    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    public void setup() {
        List<Product> products = new ArrayList<>();

        product1 = new Product();
        product1.setTitle("Product 1");
        product1.setCost(50);

        product2 = new Product();
        product2.setTitle("Product 2");
        product2.setCost(30);

        product3 = new Product();
        product3.setTitle("Product 3");
        product3.setCost(70);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        shop = new Shop();
        shop.setProducts(products);
    }

    @Test
    public void testSortProductsByPrice() {
        List<Product> sortedProducts = shop.sortProductsByPrice();
        assertThat(sortedProducts).containsExactly(product2, product1, product3);
    }

    @Test
    public void testGetMostExpensiveProduct() {
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        assertThat(mostExpensiveProduct.getTitle()).isEqualTo("Product 3");
        assertThat(mostExpensiveProduct.getCost()).isEqualTo(70);
    }
}
