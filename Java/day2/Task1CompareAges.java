//1.your function takes two argument
//your function takes two arguments
//current fsthers age(years)
//current age of son(years)

//calculate how many  years ago 
//father was twice as old as son(or in how many years time to come)
//he will be twice as old
//the answer is always greater or equal to 0 no matter if it was in the past or future

public class Task1compareAges {
public static void main(String[] args) {
boolean result = isTwiceOld(20, 60);
System.out.println("age difference is " + result);
}

public static boolean isTwiceOld(int ageSon, int ageFather) {
for (int minimumAgeDifferencei = 13; minimumAgeDifferencei < 100; minimumAgeDifferencei++) {
ageSon = minimumAgeDifferencei;
if (ageFather ==2*ageSon) {
       

System.out.println("At this age, father twice as old " + ageSon  );
return true;
}
else {
System.out.println("Father age is not twice that of son " + ageSon);
}
return false;
}

}
}