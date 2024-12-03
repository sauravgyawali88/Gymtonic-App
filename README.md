Fitness Tracker App Testing
Team Information

Team Members:
Saurav Gyawali (Student ID: A00301312)
Manpreet Kaur (Student ID: A00307693)
Abijith (Student ID: A00310598)

Application Overview
Introduction:
The Fitness Tracker App is a mobile application designed to help users monitor their physical activities, including step count, calories burned, and workout performance.

Key Features:
Monitors steps, calories burned, and workout data.
Syncs with external fitness devices or APIs (like Google Fit, Apple Health).
Displays activity data such as steps, calories burned, and workout stats on a user-friendly interface.
Allows users to view past activity records and track their progress over time.

GitHub Repository:
https://github.com/sauravgyawali88/Gymtonic-App

Strategy:
Our testing will ensure that the app’s key functions are fully operational. The following testing methods will be employed:

Unit Testing for functions like step counting and calorie calculations.
UI Testing to check that data displays properly and the interface is responsive.
Integration Testing to validate the app’s integration with external services like Google Fit and Apple Health.
Performance Testing to assess the app's efficiency when managing large datasets over extended periods.
Security Testing to ensure proper handling of sensitive user information.

Types of Testing
Unit Testing:
Calories Calculation: Verify the function responsible for calculating calories based on step data.
Data Sync: Test the synchronization logic between the app and external fitness APIs or devices.
UI Testing:
Step Count Display: Confirm that the app correctly shows the step count.
Graph Updates: Ensure that the graphs properly update with new workout data.
Integration Testing:
API Integration: Test the successful integration of the app with fitness APIs, such as Google Fit or Apple Health.
Security Testing:
OAuth Login: Test the OAuth login system to ensure secure user authentication.
Data Encryption: Verify that sensitive user data, such as activity logs, is securely stored and transmitted.


Testing Methods
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



