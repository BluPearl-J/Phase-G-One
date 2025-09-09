
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

public class LagbbajaSchool {

public static void main(String[] args) {
        
ArrayList<String> subjects = new ArrayList<>();
 ArrayList<Integer> scores = new ArrayList<>();
ArrayList<String> studentNames = new ArrayList<>();
ArrayList<Integer> studentTotalScores = new ArrayList<>();
ArrayList<Double> studentAverageScores = new ArrayList<>();

Scanner input = new Scanner(System.in);
System.out.println("Enter Teachers name:");
String teacherName = input.nextLine();

System.out.println("How many students do you have?:");
int numberOfStudents = Integer.parse(input.nextLine()); 

System.out.println("How many subjects does each student offer?");
int numberOfSubjects = Integer.parseInt(input.nextLine());

for (int i = 0; i < numberOfSubjects; i++) {
System.out.println("Enter name of subject #" + (i + 1) + ":");
String subjectName = input.nextLine();
subjects.add(subjectName);
}

for (int i = 0; i < numberOfStudents; i++) {
System.out.println("\nENTERING SCORES FOR STUDENT NUMBER#" + (i + 1));

System.out.println("Enter name of student #" + (i + 1) + ":");
String currentStudentName = input.nextLine();
sstudentNames.add(currentStudentName);

int totalScore = 0;

for (int j = 0; j < numberOfSubjects; j++) {
 System.out.println("Enter score for " + subjects.get(j) + ":");
 int score = Integer.parseInt(input.nextLine());
scores.add(score);
 totalScore += score;
}

studentTotalScores.add(totalScore);
double average = (double) totalScore / numberOfSubjects;
 studentAverageScores.add(average);

System.out.println("Saving >>>>>>>>>>>>>>>.");
System.out.println("Saved successfully");
}

displayClassSummary(teacherName, subjects, scores, studentNames, studentTotalScores, studentAverageScores, numberOfStudents, numberOfSubjects);
 }

   
public static void displayClassSummary(String teacherName, ArrayList<String> subjects, ArrayList<Integer> scores, ArrayList<String> studentNames, ArrayList<Integer> studentTotalScores, ArrayList<Double> studentAverageScores, int numberOfStudents, int numberOfSubjects) {





      
System.out.println("Teacher Name: " + teacherName);
System.out.println("Date: " + LocalDate.now());
System.out.println("Time: " + LocalTime.now());
System.out.println("------");

        // Calculate positions 
ArrayList<Integer> positions = new ArrayList<>();
        

for (int currentStudentIndex = 0; currentStudentIndex < numberOfStudents; currentStudentIndex++) {
int position = 1;
for (int comparisonStudentIndex = 0; comparisonStudentIndex < numberOfStudents; comparisonStudentIndex++) {
        if (studentTotalScores.get(comparisonStudentIndex) > studentTotalScores.get(currentStudentIndex)) {
            position++;
        }
    }
    positions.add(position);
}



           

        // Display tabular summary
        System.out.println("\nCLASS SUMMARY");
        System.out.print("STUDENT\t");
        for (String subject : subjects) {
            System.out.print(subject + "\t");
        }
        System.out.println("TOT\tAVE\tPOS");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(studentNames.get(i) + "\t");
            for (int j = 0; j < numberOfSubjects; j++) {
                int index = i * numberOfSubjects + j;
                System.out.print(scores.get(index) + "\t");
            }
           

System.out.println(studentTotalScores.get(i) + "\t" + studentAverageScores.get(i) + "\t" + positions.get(i));

        }

        // Subject Analysis
        System.out.println("\nSUBJECT ANALYSIS");
        for (int j = 0; j < numberOfSubjects; j++) {
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;
            int total = 0;
            int passes = 0;
            int fails = 0;
            String highStudent = studentNames.get(0);
            String lowStudent = studentNames.get(0);

// assuming scores are ordered correctly

            for (int i = 0; i < numberOfStudents; i++) {
                int index = i * numberOfSubjects + j;
                int score = scores.get(index);
                total += score;
                if (score >= 50) passes++;
                else fails++;

                if (score > highest) {
                    highest = score;
                    highStudent = studentNames.get(i);
                }
                if (score < lowest) {
                    lowest = score;
                    lowStudent = studentNames.get(i);
                }
            }

            double average = (double) total / numberOfStudents;
            System.out.println("Subject: " + subjects.get(j));
            System.out.println("Highest scoring student: " + highStudent + " scoring " + highest);
            System.out.println("Lowest scoring student: " + lowStudent + " scoring " + lowest);
            System.out.println("Total Score: " + total);
            System.out.printf("Average Score: %.2f%n", average);
            System.out.println("Passes: " + passes);
            System.out.println("Fails: " + fails);
            System.out.println("---------------------");
        }

        System.out.println("\nTHANK YOU FOR USING LAGBAJA SCHOOL SYSTEM!");
    }
}


