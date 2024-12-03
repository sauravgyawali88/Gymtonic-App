# Fitness Tracker App Testing

**Group Information**

# Group Members:
Saurav Gyawali (Student ID: A00301312)
Manpreet Kaur (Student ID: A00307693)
Abijith (Student ID: A00310598)

**Codebase**

### Application Description

### Overview:
The Fitness Tracker App is a mobile application designed to help users monitor their physical activities, including step count, calories burned, and workout performance.

### Key Features:
- Monitors steps, calories burned, and workout data.
- Syncs with external fitness devices or APIs (like Google Fit, Apple Health).
- Displays activity data such as steps, calories burned, and workout stats on a user-friendly interface.
- Allows users to view past activity records and track their progress over time.

### Application URL
GitHub Repository:
https://github.com/sauravgyawali88/Gymtonic-App

### Selection Reason
We chose the Fitness Tracker app for testing because it includes essential features like activity tracking, data synchronization, and displaying workout information. 
These features provide a wide range of testing opportunities, including UI, functionality, and integration tests, making it an ideal app to evaluate and ensure its performance and reliability.

## Initial Plan 
Our testing approach includes testing the app’s main features like tracking activities, syncing data, and displaying information.
We’ll check if everything works correctly, test how the app performs, and make sure it’s secure and works well. 

## Types of Testing
Unit Testing:
- Calories Calculation: Verify the function responsible for calculating calories based on step data.
- Data Sync: Test the synchronization logic between the app and external fitness APIs or devices.

UI Testing:
- Step Count Display: Confirm that the app correctly shows the step count.
- Graph Updates: Ensure that the graphs properly update with new workout data.

Integration Testing:
-API Integration: Test the successful integration of the app with fitness APIs, such as Google Fit or Apple Health.

Security Testing:
- OAuth Login: Test the OAuth login system to ensure secure user authentication.
- Data Encryption: Verify that sensitive user data, such as activity logs, is securely stored and transmitted.

## Testing Methods
Boundary Value Analysis:
We will apply boundary value analysis to test the app’s response to extreme input values, such as very low and very high step counts or calorie calculations.

Exploratory Testing:
Exploratory testing will be conducted to evaluate the app’s overall functionality, looking for UI issues, unexpected behavior, and potential usability improvements.

Tools Utilized
Testing Tools:
Appium: Used for automating mobile app UI tests.
JUnit: For writing and running unit tests for logic checks.
Firebase Test Lab: For testing the app across different devices and simulating various conditions.

Development Tools:
Android Studio: Used for building and developing the app.
GitHub: For version control and team collaboration.
Azure DevOps: For project management and task tracking.
Slack: For communication and collaboration among team members.

Collaboration Links
GitHub Repository: Fitness Tracker App GitHub
Azure DevOps Board: Azure DevOps Board (Insert your link here)
Slack Workspace: Slack Workspace (Insert your link here)

Initial Plan and Task Distribution
Test Breakdown:
Unit Tests:
Test the calorie calculation and data sync functions.
UI Tests:
Ensure the app properly displays step counts and updates graphs.
Integration Tests:
Verify that the app integrates smoothly with external APIs like Google Fit.


Task Assignments:
Saurav:
Implement and execute unit tests for calorie calculation and syncing.
Conduct exploratory testing.

Abijith:
Write and execute UI tests for step count and graph updates.
Perform integration testing with external APIs.

Manpreet
Conduct security tests, including OAuth and data encryption.
Carry out performance testing for large datasets.

Types of Tests:

1. Security Testing: The goal is to ensure the protection of sensitive user data and prevent unauthorized access.
Key Areas & Test Cases:

1. OAuth Flow Validation:
Verify the correct functioning of OAuth authorization and token generation processes.
Test for correct handling of invalid tokens.
2. Token Expiry and Refresh Mechanisms:
Validate token expiration and the secure issuance of refreshed tokens.
Ensure old tokens are invalidated after refresh.
3. Scope Permissions
Test access tokens to ensure they provide only the required permissions and prevent privilege escalation.
4. Encryption Algorithm Testing:
Validate the encryption of sensitive health data (e.g., activity logs, heart rate).
Check compliance with standards like AES-256.
5. Data Encryption in Transit: 
Ensure all data transmitted between the client and server uses HTTPS with TLS.
6. SQL Injection Testing: 
Test for SQL injection vulnerabilities in all endpoints interacting with the database.
7. Cross-Site Scripting (XSS) Testing: 
Identify any unvalidated inputs in the UI that could lead to script injection.
8. Cross-Site Request Forgery (CSRF) Testing:
Validate that CSRF tokens are implemented and effective.
9. Session Management Testing: 
Ensure sessions expire after token invalidation or inactivity.
10. Error Message Validation:
Test that error messages do not reveal sensitive system information.
11. Sensitive Data Logging:
Ensure sensitive information like tokens or user health data is not exposed in logs.
12. Rate Limiting Testing: 
Validate that rate-limiting mechanisms are applied to prevent abuse of authentication endpoints.

2. Performance Testing: The focus is on ensuring smooth operation when processing extensive datasets and handling high user concurrency.
Key Areas & Test Cases:

1. Load Testing: 
Simulate high user activity (e.g., simultaneous data uploads) to measure system performance during peak hours.
2. Stress Testing: 
Gradually increase load beyond normal limits to determine failure points.
3. Concurrency Testing: 
Simulate multiple users uploading fitness logs simultaneously to test database consistency and system response.
4. Database Query Optimization:
Test the performance of queries used to retrieve and process user activity logs.
5. API Latency Testing:
Measure API response times under heavy workloads with large datasets.
6. Batch Data Processing: 
Evaluate the system's efficiency in processing bulk uploads of fitness data.
7. Memory Usage Analysis: 
Monitor memory consumption during operations on large datasets to identify potential memory leaks.
8. Caching Performance:
Test caching mechanisms (e.g., Redis) for improving data retrieval performance.
9. Data Export/Import Testing: 
Validate the app’s ability to handle bulk data exports (e.g., user activity history) and imports.
10. ETL Pipeline Testing:
Test the extraction, transformation, and loading of large datasets into the database.
11. Failover and Recovery Testing: 
Test system recovery and failover mechanisms after high-load failures.
12. Real-Time Synchronization Testing: 
Validate the app's ability to sync fitness data between multiple devices in real-time without lag.

Testing Techniques:

1. Boundary Value Analysis
Why: To test edge cases for data size and input limits.
Implementation:
Test with maximum daily activity log sizes and token payloads.
Validate API responses for minimum and maximum dataset sizes.
Related Test Types: Security Testing (handling token sizes) and Performance Testing (handling extreme data limits).
2. Equivalence Partitioning
Why: To group similar inputs and reduce redundant test cases.
Implementation:
Partition activity logs into valid and invalid groups for API testing.
Categorize dataset sizes into small, medium, and large for performance evaluation.
Related Test Types: Security Testing (valid/invalid token handling) and Performance Testing (efficiency under varying loads).






