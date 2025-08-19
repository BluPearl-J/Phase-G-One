#4 you were camping with friends far away from home
#when its time to go back you realise fuel is running out
#and nearest pump is 50 miles away
#you know on average car runs on 25miles per gallon/.
#there are 2 gallons left
#write function that tells you if possible to get to pump or not
#function returnm true if possible


def is_possible_get_pump(number_of_gallons,nearest_pump):
   CONSTANT=25
   result=(number_of_gallons*CONSTANT)
   if result< nearest_pump:
    print("For ths number of gallons, is not possible to get to nearest pump,show number of gallons,nearest pump:", number_of_gallons,nearest_pump)
    return True
   elif result>nearest_pump:
    print("It is possible to get to nearest pump with these gallons", number_of_gallons)
    return False

   

is_possible_get_pump(80,100)
is_possible_get_pump(75,90)
is_possible_get_pump(3,100)
is_possible_get_pump(80,10000)



