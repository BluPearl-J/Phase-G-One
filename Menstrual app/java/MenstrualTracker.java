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
if(periodFirstDate>31||periodFirstDate<0){
throw new IllegalArgumentException("ERROR;DATE OF THE MONTH CANNOT BE NEGATIVE OR GREATER THAN 31!!!ENTER ANY INTEGER BETWEEN 1 AND 31 ONLY");

}
System.out.println("Enter lastDate of last most recent period:");
int periodLastDate=input.nextInt();
if(periodLastDate>31||periodLastDate<0){
throw new IllegalArgumentException("ERROR;DATE OF THE MONTH CANNOT BE NEGATIVE OR GREATER THAN 31!!!ENTER ANY INTEGER BETWEEN 1 AND 31 ONLY");
}
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

