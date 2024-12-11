import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class FitnessTrackerUITest {

    private FitnessTrackerUI fitnessTrackerUI;

    @Before
    public void setup() {
        // Prepare the FitnessTrackerUI instance for testing
        fitnessTrackerUI = new FitnessTrackerUI();
    }

    /**
     * Test: Ensure step count display is updated correctly.
     */
    @Test
    public void verifyStepCountDisplay() {
        // Simulate step count values
        int initialStepCount = 5000;
        int updatedStepCount = 7000;

        // Set initial step count
        fitnessTrackerUI.setStepCount(initialStepCount);
        assertEquals("Step count should be initially displayed as 5000", 5000, fitnessTrackerUI.getStepCount());

        // Update step count
        fitnessTrackerUI.setStepCount(updatedStepCount);
        assertEquals("Step count should reflect the updated value of 7000", 7000, fitnessTrackerUI.getStepCount());
    }

    /**
     * Test: Ensure the graph updates with new workout data.
     */
    @Test
    public void verifyGraphUpdates() {
        // Simulate initial workout data for the graph
        Map<String, Integer> initialGraphData = new HashMap<>();
        initialGraphData.put("Running", 30);
        initialGraphData.put("Cycling", 20);

        // Simulate updated workout data for the graph
        Map<String, Integer> updatedGraphData = new HashMap<>();
        updatedGraphData.put("Running", 45);
        updatedGraphData.put("Cycling", 35);

        // Set initial graph data
        fitnessTrackerUI.setGraphData(initialGraphData);
        assertEquals("Graph should initially display the correct workout data", initialGraphData, fitnessTrackerUI.getGraphData());

        // Update graph data
        fitnessTrackerUI.setGraphData(updatedGraphData);
        assertEquals("Graph data should update to reflect new values", updatedGraphData, fitnessTrackerUI.getGraphData());
    }
}
