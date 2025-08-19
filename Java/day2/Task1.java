//1.your function takes two argument
//your function takes two arguments
//current fsthers age(years)
//current age of son(years)

//calculate how many  years ago 
//father was twice as old as son(or in how many years time to come)
//he will be twice as old
//the answer is always greater or equal to 0 no matter if it was in the past or future


public class compareAges{

public static void main(String[]args){
isTwiceOld(80,30);
}
public static boolean isTwiceOld(int age1, int age2){
int ageSon;
int ageFather=0;

for(int minimumAgeDifferencei=13; minimumAgeDifferencei<100;minimumAgeDifferencei++)
ageFather=ageSon+minimumAgeDifferencei;
bool result=true;
if (ageFather==2*ageSon){
return result;
System.out.println("x years total, father is twice as old:", minimumAgeDifferencei );
}
else{
System.out.println("father is not yet twice as old as son");

}
}
}