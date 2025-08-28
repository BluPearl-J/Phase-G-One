import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

public class LagbbajaSchool {

public static void main(String[] args) {
        
List<String> subjects = new ArrayList<>();
List<Integer> scores = new ArrayList<>();


Scanner input = new Scanner(System.in);
System.out.println("Enter student's name:");
String studentName = input.nextLine();

System.out.println("How many students do you have?");
int numberOfStudents = Integer.parseInt(input.nextLine());

for (int i = 0; i < numberOfStudents; i++) {
System.out.println("\nENTERING SCORES FOR STUDENT NUMBER#" + (i + 1));

System.out.println("How many subjects does this student offer?");
int numberOfSubjects = Integer.parseInt(input.nextLine());

for (int j = 0; j < numberOfSubjects; j++) {
System.out.println("Enter name of subject number #" + (j + 1) + ":");
String subjectName = input.nextLine();
subjects.add(subjectName);

System.out.println("Enter score for " + subjectName + ":");
int score = Integer.parseInt(input.nextLine());
scores.add(score);
}

System.out.println("Saving >>>>>>>>>>>>>>>.");
System.out.println("Saved successfully");
}

displayClassSummary(studentName, subjects, scores);
}

public static void displayClassSummary(String studentName, List<String> subjects, List<Integer> scores) {
      
System.out.println("Student Name: " + studentName);
System.out.println("Date: " + LocalDate.now());
System.out.println("Time: " + LocalTime.now());
System.out.println("-------------");

int totalScore = 0;
for (int i = 0; i < subjects.size(); i++) {
System.out.printf("%-15s : %-5d%n", subjects.get(i), scores.get(i));
totalScore += scores.get(i);
}

double averageScore = subjects.size() > 0 ? (double) totalScore / subjects.size() : 0;

System.out.println("----------");
System.out.println("Total Score: " + totalScore);
System.out.printf("Average Score: %.2f%n", averageScore);
System.out.println("\nTHANK YOU FOR USING LAGBAJA SCHOOL SYSTEM!");
}
}
