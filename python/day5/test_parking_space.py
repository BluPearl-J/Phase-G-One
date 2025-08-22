from unittest import TestCase
import parking_space

class Test_parking_space(TestCase):

 def test_occupy_space(self):
  result = parking_space.occupy_space("ToyotaReg-123Abuja")
  
  self.assertEqual(result, "ToyotaReg-123Abuja added at above index position .")

 def test_occupy_space(self):
  result = parking_space.occupy_space("Ford Reg-XD567Lagos")
  
  self.assertEqual(result, "Ford Reg-XD567Lagos added at above index position .")

 
 def test_display_vacant_space(self):
#Arrange
  result = parking_space.display_vacant_space()
  
  self.assertEqual(result, ["1. ToyotaReg-123Abuja"])



 def test_remove_car_in_parking_space(self):
  result = parking_space.remove_car("Ford Reg-XD567Lagos")
  self.assertEqual(result, "Ford Reg-XD567Lagos has left its slot.index vacant.")

 def test_remove_car_not_in_list(self):
   result = parking_space.remove_car("Limousine")
   self.assertEqual(result, "Limousine not found in list.")






#	
#        occupied_space=parking_space.display_space(jump into spce 9)
#       self.assertEqual(occupied_space, space 9)
#      add_item("car into space 5")
#        add_item("taxi into space9")
#       result = show_items()
 #       self.assertEqual(result, ["5. Car", "9. taxi"])
#int count =0; for item in range i++;counter-1;




		