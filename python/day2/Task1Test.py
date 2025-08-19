#1.your function takes two argument
#your function takes two arguments
#current fsthers age(years)
#current age of son(years)

#calculate how many  years ago 
#father was twice as old as son(or in how many years time to come)
#he will be twice as old
#the answer is always greater or equal to 0 no matter if it was in the past or future




import unittest 
import Task1modifiedForTest



class TestCompareAges(unittest.TestCase):

def test_if_the_function_exists(self):
    task1modifiedForTest.is_twiceold(20,60)

def test_if_def_is_twice_old_is_working(self):
    result = Task1modifiedforTest.is_twice_old(20,60)
    self.assertEqual(result ,30)

 def test_if_def_is_twice_old_is_working(self):
    result = Task1modifiedforTest.is_twice_old(10,80)
    self.assertEqual(result ,40)
 def test_if_the_ValueError_is_working(self):
     self.assertRaises(ValueError, Task1modifiedforTest.is_twice_old, 20,"p")
 

def test_if_the_ValueError_is_working(self):
     self.assertRaises(ValueError,Task1modifiedforTest.is_twice_old,10,-6)
  



def test_if_def_is_twice_old_is_working(self):
    result = Task1modifiedforTest.is_twice_old(10,50)
        self.assertEqual(result,False) 


     
   
def test_if_def_is_twice_old_is_working(self):
    result = Task1modifiedforTest.is_twice_old(25,50)
        self.assertEqual(result, True) 
     
     
     