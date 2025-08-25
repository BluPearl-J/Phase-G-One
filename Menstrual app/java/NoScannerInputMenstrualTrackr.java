public class NoScannerInputMenstrualTrackr {


public static void main(String[]args){
NoScannerInputMenstrualTrackr  noscannerinputmenstrualtrackr=new NoScannerInputMenstrualTrackr();
int result=noscannerinputmenstrualtrackr.getFlowDays(28,31);
int answer=noscannerinputmenstrualtrackr.getFlowDays(10,19);
System.out.println(result);
System.out.println(answer);
}

public static int getFlowDays(int periodFirstDate, int periodLastDate) {
if (periodFirstDate > 31 || periodFirstDate < 1) {
throw new IllegalArgumentException("ERROR: DATE OF THE MONTH MUST BE BETWEEN 1 AND 31");
}

if (periodLastDate > 31 || periodLastDate < 1) {
throw new IllegalArgumentException("ERROR: DATE OF THE MONTH MUST BE BETWEEN 1 AND 31");
}

int bleedingDays = periodLastDate - periodFirstDate;

if (bleedingDays >= 2 && bleedingDays <= 7) {
System.out.println("Congratulations!for start Date:"+ periodFirstDate +"and period last Date:"+ periodLastDate + "You have " + bleedingDays + " menstrual flow days. It is perfectly normal.");
} 
else {
System.out.println("Abnormal menstrual length of medical concern for period first date of:" + " "+ periodFirstDate +" " + " " "+ "and last Red day of:"+ periodLastDate+ "See a healthcare provider immediately.");
}

return bleedingDays;
}
}
