import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroceryManagerTest {

@Test
public void testAddItems() {
String[] items = {"Juice", "Bread", "Eggs"};
GroceryManager2.addItems(items);
assertArrayEquals(items, GroceryManager2.getItems());
}

@Test
public void testRemoveItem() {
String[] items = {"Juice", "Bread", "Eggs"};
GroceryManager2.addItems(items);
GroceryManager2.removeItem("Bread");
String[] expected = {"Juice", null, "Eggs"};
assertArrayEquals(expected, GroceryManager2.getItems());
}

@Test
public void testRemoveNonExistentItem() {
String[] items = {"Juice", "Bread"}; 
GroceryManager2.removeItem("Butter");

assertArrayEquals(items, GroceryManager2.getItems());
    }
}
