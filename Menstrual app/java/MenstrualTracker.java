import java.util.Scanner;

public class MenstrualTracker{
public static void main(String[]args){
MenstrualTracker menstrualtracker=new MenstrualTracker();
int result=menstrualtracker.getFlowDates(28,31);
System.out.println(result);
}

public static int getFlowDates(int startDatePeriod,int EndDatePeriod){
System.out.println("Enter startDate of last most recent period:");
Scanner input=new Scanner(System.in);
int periodFirstDate=input.nextInt();
System.out.println("Enter lastDate of last most recent period:");
int periodLastDate=input.nextInt();

int bleedingDays=(periodLastDate-periodFirstDate);
if(bleedingDays<=2||bleedingDays<=7){
System.out.println("Congratulations!You have:" + bleedingDays+" " +"menstrualFlowLength."+" " +" "+ "it is perfectly Normal");
}
else if(bleedingDays<2||bleedingDays>7){
System.out.println("Abnormal menstrual length of medical concern,See a healthcare provider immediately");
}
return bleedingDays;
}

//cycleDuration;
}


