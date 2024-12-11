import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class FitnessTrackerUITest {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Test: Verify step count display is accurate and updates correctly
     */
    @Test
    public void testStepCountDisplay() {
        // Navigate to login page
        driver.get("https://fitness-tracker.com/login");

        // Perform login actions
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.id("loginButton")).click();

        // Wait for dashboard to load
        WebElement stepCountElement = driver.findElement(By.id("stepCountDisplay"));

        // Check if the step count is visible and numeric
        assertTrue("Step count display is not visible", stepCountElement.isDisplayed());
        String stepCount = stepCountElement.getText();
        assertTrue("Step count should be numeric", stepCount.matches("\\d+"));

        // Simulate step count update and verify changes
        driver.findElement(By.id("refreshStepsButton")).click();
        WebElement updatedStepCountElement = driver.findElement(By.id("stepCountDisplay"));
        String updatedStepCount = updatedStepCountElement.getText();
        assertNotEquals("Step count should be updated after refresh", stepCount, updatedStepCount);
    }

    /**
     * Test: Verify workout graph updates correctly with new data
     */
    @Test
    public void testGraphUpdate() {
        // Navigate to dashboard after login
        driver.get("https://fitness-tracker.com/login");

        // Perform login actions
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.id("loginButton")).click();

        // Locate the graph element
        WebElement graphElement = driver.findElement(By.id("workoutGraph"));
        assertTrue("Workout graph is not visible", graphElement.isDisplayed());

        // Simulate adding workout data
        driver.findElement(By.id("addWorkoutButton")).click();
        driver.findElement(By.id("workoutType")).sendKeys("Running");
        driver.findElement(By.id("workoutDuration")).sendKeys("30");
        driver.findElement(By.id("saveWorkoutButton")).click();

        // Verify the graph is updated
        WebElement updatedGraphElement = driver.findElement(By.id("workoutGraph"));
        assertTrue("Workout graph should update after adding data", updatedGraphElement.isDisplayed());
    }
}
