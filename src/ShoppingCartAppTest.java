
//import org.junit.Assert;
//import org.junit.Test;

//import com.tdd.shoppingcart.Product;
//import com.tdd.shoppingcart.ShoppingCart;

public class ShoppingCartAppTest {

	@Test
	public void testCreateEmptyShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Assert.assertEquals(0, cart.getProductCount());
	}
	
	@Test
	public void testAddSingleProductToShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("x", 1, 30.0);
		cart.addProduct(product);
		Assert.assertEquals(1, cart.getProductCount());
		Assert.assertEquals(30.0, cart.getTotalCartValue(),0.0);
	}
	
	@Test
	public void addDifferentProductsToTheCart(){
		ShoppingCart cart = new ShoppingCart();
		Product x = new Product("x", 1, 30.0);
		Product y = new Product("y", 1, 100.0);
		cart.addProduct(x);
		cart.addProduct(y);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(130.0, cart.getTotalCartValue(),0.0);
	}
}
