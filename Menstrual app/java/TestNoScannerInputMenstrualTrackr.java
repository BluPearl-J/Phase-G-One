import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestNoScannerInputMenstrualTrackr {

@Test
void testStartDateGreaterThan31ThrowsException() {
assertThrows(IllegalArgumentException.class, () -> {
NoScannerInputMenstrualTrackr.getFlowDays(40, 15);
});
}

@Test
void testEndDateGreaterThan31ThrowsException() {
assertThrows(IllegalArgumentException.class, () -> {
           NoScannerInputMenstrualTrackr.getFlowDays(15, 80);
        });
    }

    @Test
    void testValidDatesReturnsCorrectBleedingDays() {
        int result = NoScannerInputMenstrualTrackr.getFlowDays(10, 15);
        assertEquals(5, result);
    }

    @Test
    void testBleedingDaysOutsideNormalRangeTriggersWarning() {
        int result = NoScannerInputMenstrualTrackr.getFlowDates(10, 20); // 10 days
        assertEquals(10, result); // Still returns the value, but prints warning
    }
}
