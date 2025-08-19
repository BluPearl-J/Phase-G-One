#2.complete function so that it finds average of 3 scores passed to it
# and returns lettter value associated
#numerical score       letter grade
#90<=score<=100  'A'
#80<=SCORE<90   'B'
#70<=SCORE<80   'C'
#60<=score<70  'D'
#0<=score<60    'F'
#test values between 0 and 100
#no need for edge negative values or those greater 100


def get_scores(score1,score2,score3):
    sum=0;
    
    for number in range(1, 101,1):  #1 to 100 inclusive
     sum+=(score1+score2+score3)
     average_score=sum/3
     
     print(average_score)
     return average_score


    if average_score < 0 or average_score > 100:
        print("Error: enter a number from 0 to 100")
        return None  #Return None invalid
    else:
        return average_score


    

    if 90<=average_score<=100:
        print("Excellent,A ")

    elif 80<=average_score<90:
        print("B scored!")

    elif 70<=average_score<80:
        print("C")

    elif 60<=average_score<70:
        print("D")
    elif 0<=average_score<60:
        print("F")
    else:
        print("no grade detected")

get_scores(20,30,60)
get_scores(80,30,60)
get_scores(90,1,15)



