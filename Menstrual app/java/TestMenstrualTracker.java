import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMenstrualTracker {

@Test
public void testGetFlowDates() {
//ARRANGE
int startDate =28;
int EndDate=31;
//ACT
MenstrualTracker menstrualtracker=new MenstrualTracker();
int result=menstrualtracker.getFlowDates(startDate,EndDate);
// ASSERT

assertEquals(result,3);
//cmd prompt is javac -cp "junit-platform-console-standalone-1.9.2.jar" MenstrualTracker.java TestMenstrualTracker.java
//javac -cp "junit-platform-console-standalone-1.9.2.jar" MenstrualTracker.java TestMenstrualTracker.java
//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --scan-classpath
//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class TestMenstrualTracker
}
}
