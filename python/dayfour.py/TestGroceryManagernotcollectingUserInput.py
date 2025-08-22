import unittest

class TestGroceryManagernotcollectingInput(unittest.TestCase):
   
    def test_add_item(self):
        result = add_item("Orange")
        self.assertIn("Orange", grocery_list)
        self.assertEqual(result, "Orange added.")

    def test_remove_item_in_grocerylist(self):
        add_item("Cashew")
        result = remove_item("Cashew")
        self.assertNotIn("Cashew", grocery_list)
        self.assertEqual(result, "Cashew removed from list.")

    def test_remove_item_not_in_list(self):
        result = remove_item("Orange")
        self.assertEqual(result, "Orange not found in list")

    def test_show_items(self):
        add_item("Bread")
        add_item("Bread")
        result = show_items()
        self.assertEqual(result, ["1. Cashew", "2. Bread"])

    def test_show_empty_list(self):
        result = show_items()
        self.assertEqual(result, "Grocery list is empty.")

