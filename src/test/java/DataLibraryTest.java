import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import datastorage.RoutineHistoryManager;
import datastorage.DataLibrary;

import java.util.ArrayList;

public class DataLibraryTest {
    @Test void updateHistory(){
        ArrayList<String> testing = new ArrayList<>();
        testing.add("15");
        testing.add("25");
        testing.add("35");
        RoutineHistoryManager testmanager = new RoutineHistoryManager();
        testmanager.updateHistory();
        Assertions.assertTrue(testmanager.updateHistory());
    }
    @Test void take_in_data(){
        ArrayList<String> sample = new ArrayList<>();
        sample.add("10");
        sample.add("20");
        sample.add("30");
        DataLibrary testlib = new DataLibrary("pullUps", sample, sample, 40);
        testlib.take_in_data("pullUps", sample, sample, 40);
        Assertions.assertTrue(testlib.take_in_data("pullUps", sample, sample, 40));
    }
}