#1.your function takes two argument
#your function takes two arguments
#current fsthers age(years)
#current age of son(years)

#calculate how many  years ago 
#father was twice as old as son(or in how many years time to come)
#he will be twice as old
#the answer is always greater or equal to 0 no matter if it was in the past or future




def is_twice_old(ageSon,ageFather):
 for age in range(13,100,1):
  ageSon = age
  if (ageFather==2*ageSon):
   print("Age of son when,father twice as old as son")
   print( age  );
   return True;
  else:
   print("father is not as twice as old as son")
   print( age  );

print(is_twice_old(20, 60))

is_twice_old(10, 80)



  
