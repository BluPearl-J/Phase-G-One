import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroceryManagerTest {

@Test
public void testAddItems() {
String[] items = {"Juice", "Bread", "Eggs"};
GroceryManagerOne.addItems(items);
assertArrayEquals(items, GroceryManager.getItems());
}

@Test
public void testRemoveItem() {
String[] items = {"Juice", "Bread", "Eggs"};
GroceryManagerOne.addItems(items);
GroceryManagerOne.removeItem("Bread");
String[] expected = {"Juice", null, "Eggs"};
assertArrayEquals(expected, GroceryManager2.getItems());
}

@Test
public void testRemoveNonExistentItem() {
String[] items = {"Juice", "Bread"}; 
GroceryManager.removeItem("Butter");

assertArrayEquals(items, GroceryManager.getItems());
    }
}
