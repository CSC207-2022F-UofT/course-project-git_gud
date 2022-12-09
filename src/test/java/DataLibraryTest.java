import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import datastorage.RoutineHistoryManager;
import datastorage.DataLibrary;

import java.util.ArrayList;

public class DataLibraryTest {
    @Test void updateHistory(){
        ArrayList<String> testing = new ArrayList<>();
        RoutineHistoryManager testmanager = new RoutineHistoryManager("pullUps", 10, 2, 3, 20);
        testmanager.updateHistory();
        Assertions.assertTrue(testmanager.updateHistory());
    }
    @Test void take_in_data(){
        ArrayList<String> sample = new ArrayList<>();
        DataLibrary testlib = new DataLibrary("pullUps", 10, 20, 40);
        testlib.take_in_data("pullUps", 10, 20, 40);
        Assertions.assertTrue(testlib.take_in_data("pullUps", 10, 20, 40));
    }
}