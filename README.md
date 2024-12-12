# Fitness Tracker App Testing

### Group Information

**Group Members:**
Saurav Gyawali (Student ID: A00301312)
Manpreet Kaur (Student ID: A00307693)
Abijith (Student ID: A00310598)

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

### Initial Plan 
Our testing approach includes testing the app’s main features like tracking activities, syncing data, and displaying information.
We’ll check if everything works correctly, test how the app performs, and make sure it’s secure and works well. 

### Types of Testing
**Unit Testing:**
why it is appropriate 
- Calories Calculation: Verify the function responsible for calculating calories based on step data.
- Data Sync: Test the synchronization logic between the app and external fitness APIs or devices.

**UI Testing:**
why it is appropriate 
- Step Count Display: Confirm that the app correctly shows the step count.
- Graph Updates: Ensure that the graphs properly update with new workout data.

**Integration Testing:**
why it is appropriate 
-API Integration: Test the successful integration of the app with fitness APIs, such as Google Fit or Apple Health.

**Security Testing:**
why it is appropriate
- OAuth Login: Test the OAuth login system to ensure secure user authentication.
- Data Encryption: Verify that sensitive user data, such as activity logs, is securely stored and transmitted.

### Testing Methods
- Boundary Value Analysis:
We will apply boundary value analysis to test the app’s response to extreme input values, such as very low and very high step counts or calorie calculations.

- Exploratory Testing:
Exploratory testing will be conducted to evaluate the app’s overall functionality, looking for UI issues, unexpected behavior, and potential usability improvements.

### Development Tools:
Android Studio: Used for building and developing the app.
GitHub: For version control and team collaboration.
Azure DevOps: For project management and task tracking.
Slack: For communication and collaboration among team members.

### Collaboration Links
GitHub Repository: Fitness Tracker App GitHub 

Azure DevOps Board: https://dev.azure.com/A00307693/Fitness%20Track%20App 

Slack Workspace: https://app.slack.com/client/T0840EBNGKA/D08352P75UN 

### Task Assignments:
Saurav:
Implement and execute unit tests for calorie calculation and syncing.
Conduct exploratory testing.

Abijith:
Write and execute UI tests for step count and graph updates.
Perform integration testing with external APIs.

Manpreet
Conduct security tests, including OAuth and data encryption.
Carry out performance testing for large datasets.

**Types of Tests:**

**1. Security Testing:** 
Security Testing ensures the Fitness Tracker App is safe from unauthorized access and data leaks, which is very important because it handles sensitive health data. It includes Authentication, which checks user identity using OAuth tokens to keep logins secure. Data Protection makes sure user information is encrypted during storage and while being sent, so no one can steal it. Vulnerability Testing finds and fixes issues like SQL injection or Cross-Site Scripting (XSS) that hackers could use to attack the app. Finally, Session Management ensures user sessions are secure, with proper logout and automatic session expiration to prevent misuse. These steps help keep the app secure and build user trust.
What to test :

* OAuth Flow Validation.
* Token Expiry and Refresh Mechanisms.
* Scope Permissions Testing.
* Encryption Algorithm Testing.
* Data Encryption in Transit.
* SQL Injection Testing.
* Cross-Site Scripting (XSS) Testing.
* Cross-Site Request Forgery (CSRF) Testing.
* Session Management Testing.
* Error Message Validation.
* Sensitive Data Logging.
* Rate Limiting Testing.

**2. Performance Testing:**
Performance Testing makes sure the app works well under different amounts of usage, which is important for handling large datasets, like months of user activity, and many users at the same time. It includes several steps: Load Testing, which checks how the app performs during normal and heavy use; Stress Testing, which pushes the app beyond its limits to find weak spots and improve them; Scalability Testing, which ensures the app can grow and handle more users or data without problems; and Database Optimization, which focuses on keeping data storage and retrieval fast and smooth, even as the data or users increase. These tests help ensure the app runs efficiently and provides a reliable experience for users in all situations.
What to test:

* Load Testing.
* Stress Testing.
* Concurrency Testing.
* Database Query Optimization.
* API Latency Testing.
* Batch Data Processing.
* Memory Usage Analysis.
* Caching Performance.
* Data Export/Import Testing.
* ETL Pipeline Testing.
* Failover and Recovery Testing.
* Real-Time Synchronization Testing.

**Testing Techniques:**

**1. Boundary Value Analysis**
   
**Why:** To test edge cases for data size and input limits.

**Implementation:**

* Test with maximum daily activity log sizes and token payloads.
* Validate API responses for minimum and maximum dataset sizes.

**Related Test Types:** Security Testing (handling token sizes) and Performance Testing (handling extreme data limits).

**2. Equivalence Partitioning**

**Why:** To group similar inputs and reduce redundant test cases.

**Implementation:**
* Partition activity logs into valid and invalid groups for API testing.
* Categorize dataset sizes into small, medium, and large for performance evaluation.

**Related Test Types:** Security Testing (valid/invalid token handling) and Performance Testing (efficiency under varying loads).

# Check-In Meeting 2: Fitness Tracker App Testing 

**Overview:**

The second check-in meeting is a significant checkpoint for our Capstone Project. We will be showing the progress made from Check-In 1, the tests we have started working on, the problems we have faced, and plan the remaining tasks in this meeting. This meeting helps make sure that we are on track to finish the project successfully. 

**Objectives:**  

-Present the work we have done so far.  
-Demonstrate the tests we have started to implement.  
-Share Testing Implementations:  
-Show the types of tests we have applied for and the results we have gotten so far.  
-Discuss Challenges and Solutions:  
-Talk about any issues we have run into and how we solved them.  
-Plan Remaining Tasks:  
-List the tasks that are left to do before the final submission. 
-Assign tasks to team members to keep the ball rolling.  
-Ensure Alignment with Course Outcomes:  
-Make sure our work aligns with the outcomes of this course. 

**Steps to Complete:**

1. Coduct Group Meeting and Update Plan: 

Progress Presentation: 

Each member of the team will share the progress they've made since the first check-in. Here’s what we’ve done so far: 

**Saurav:**  
* Added unit tests for calorie calculation based on step count. 
* Added tests to sync data with external fitness APIs such as Google Fit and Apple Health. 
* Fixed some bugs in calorie calculation integration. 

**Manpreet:**  
* Worked on security tests, 
* Including testing the OAuth login process and data encryption.  
* Fixed issues with token refresh mechanisms and the encryption protocol. 

**Abijith:**  
* Created automated UI tests to check the update of step count display and graph. 
* Integrated the app with external APIs and verified the data sync. 
* Some UI update issues during automation.  

**Challenges and Solutions:** 

Challenges faced by Saurav:  

Problem: This would be quite tricky to perform this task: the integration with external API for calories calculation, given data in different formats.  

Solution: Accordingly, API Integration was adapted to map out matching Data fields.  

  
Abhijeeth's challenges:  

Problem: The automatic tests didn't trigger UI update events, or graph refreshing.  

Solution: Refactored Test script which may handle all dynamic UI objects updating the real data. 


 **Manpreet’s Challenges:** 

**Problem:** Sometimes, the OAuth token expired and wasn't refreshed properly.  

**Solution**: Token refresh mechanism fixed and further worked with mock data for testing various scenarios. 

 
**Plan Remaining Tasks:** 

Tasks Left to Complete:   

Performance Testing: Perform load and stress tests to ensure that the app works under intense use.  

Security Testing: Finish up testing for SQL injection, XSS, and CSRF vulnerabilities. 

Documentation: Update the README.md with progress and in-depth information about tests conducted. 

  
Assigning Tasks:  
Saurav: Continue with unit test finalization and testing API integrations. 
Abijith: Complete UI testing and ensure that the graphs are updated properly with API data.  
Manpreet: Complete all security and performance tests. 


**Meeting Minutes:** 

Action Items:

Saurav: Complete the unit tests for calories and API syncing. 

Abijith: Wrap up UI testing and finalize API integration for graph updates. 

Manpreet: Finish security tests and performance checks. Update README.md with details of our progress and tests. 


**Meeting 2 Minutes:** 

We will update our README.md file with everything discussed in the meeting: 

Progress Made: Summary of the work completed since the first check-in, including the tests we've done. 

Decisions Made: What challenges we faced and how we solved them. 

Action Items: Tasks assigned to team members and their status. 


**Progress Updates:** 

Tasks Completed:  
Unit Tests: We have written unit test cases for calorie calculations, and data synchronization with Fitness API. 
UI Tests: Automated tests for Step count display and Graph updates. 

Security Tests: We have tested the authorization of OAuth login and encryption of the data. 

Performance Tests: Testing started for initial load and to deal with stress. 

**Tests Implemented:** 

Unit Testing: We checked that calorie should be correctly calculated from the Step count. 

UI Testing: We tested the proper display of step count and graph updates in the app. 

Security Testing: We ensured that OAuth login works and that data encryption is secure. 


**Details of Tests Implemented:** 

Testing Types and Techniques Applied: 

Unit testing: For example, calculation of calories and synchronization with external API data. 

UI Testing: How to assure that step count and its representation is displayed properly and updated according to the graph. 

Security testing will look over OAuth login flow, Data encryption, and token management. 


**Saurav Gyawali - Unit Testing & API Integration**

Test Case 1: Calorie Calculation Based on Step Count 

Test Case ID: TC001 

Description: Ensure the app accurately calculates calories based on step count. 

Preconditions: 

The app should be installed and set up. 

User has inputted step data. 

Test Steps: 

Launch the app and log in with valid credentials.  

Go to the section for activity tracking.  

Input the step count.  

Trigger the calculation function for calories. 

Expected Results: 

It calculates the number of calories to have burnt for the given steps that would be inputted within this app. 


Test Case 2: Syncing with Google Fit 

Test Case ID: TC002 

Description: Confirm proper data syncing between the app and Google Fit. 

Preconditions: 

Google Fit account is linked to the app. 

The app has permission to access the Google Fit API. 

Test Steps: 

Open the app and log in. 

Navigate to the “Sync with Google Fit” option. 

Select “Sync Now”. 

Verify that the step count, calories, and workout data are accurately synced from Google Fit. 

Expected Results: 

The app should correctly sync step data, calories burned, and workouts from Google Fit to the app’s dashboard. 


Test Case 3: API Integration for Calories Calculation 

Test Case ID: TC003 

Description: Validate API integration for retrieving step data and calculating calories 

Preconditions: 

The user has an external fitness device (e.g., Fitbit). 

The app is connected to the device’s API. 

Test Steps: 

Open the app and connect to the external fitness device via Bluetooth. 

Allow the app to retrieve step data from the device. 

Ensure the step data is received correctly. 

Calculate the calories based on the received step data. 

Expected Results: 

The app should retrieve step data from the fitness device accurately. 

The app should compute the correct number of calories based on the step count. 


Test Case 4: Handling Edge Case for Calorie Calculation 

Test Case ID: TC004 

Description: Test the app’s response when calculating calories from an extremely high step count. 

Preconditions: 

The app is set up for calorie calculation. 

The user inputs an exceptionally high step count  

Test Steps: 

Open the app and log in. 

Navigate to the activity tracking section. 

Enter a large step count  

Activate the calorie calculation feature. 

Expected Results: 

The app should process large inputs without crashing. 

The app should return a valid calorie count based on the high step count. 


Test Case 5: Syncing with Apple Health 

Test Case ID: TC005 

Description: Verify syncing of data between the app and Apple Health. 

Preconditions: 

The user has linked their Apple Health account with the app. 

The app has permission to access Apple Health data. 

Test Steps: 

Open the app and log in. 

Navigate to the “Sync with Apple Health” option. 

Click on “Sync Now”. 

Verify that step count, calories, and workout data are correctly synced from Apple Health to the app. 

Expected Results: 

The app should sync and display the correct step count, calories burned, and workout data from Apple Health. 

**Abijith - UI Testing**

Test Case 1: Step Count Display on Dashboard 

Test Case ID: TC006 

Description: Verify that the app displays the correct step count on the dashboard. 

Preconditions: 

The app is installed and active. 

The user has recorded step data. 

Test Steps: 

Open the app and log in. 

Navigate to the dashboard section. 

Verify if the step count is displayed accurately. 

Expected Results: 

The app should show the correct step count on the dashboard, matching the user’s recorded data. 


Test Case 2: Graph Update After Data Sync 

Test Case ID: TC007 

Description: Ensure that the graph updates after new workout data is synced. 

Preconditions: 

The user has synced step and workout data. 

Test Steps: 

Open the app and log in. 

Sync new workout data (e.g., step count, calories burned). 

Check if the graph updates accordingly with the new data. 

Expected Results: 

The graph should display the newly synced workout data correctly. 


Test Case 3: UI Layout During Data Sync 

Test Case ID: TC008 

Description: Verify the UI layout when syncing data with an external API or device. 

Preconditions: 

The app is connected to an external API or fitness device. 

Test Steps: 

Open the app and log in. 

Initiate synchronization with the external API or device. 

Confirm that the app displays a loading indicator during the sync process. 

Check if the app shows a success or error message after sync completion. 

Expected Results: 

The UI should show an appropriate loading indicator during data sync. 

Upon completion, it should display a success or error message. 


Test Case 4: UI Responsiveness for Multiple Entries 

Test Case ID: TC009 

Description: Test the UI’s responsiveness when multiple data entries are recorded simultaneously. 

Preconditions: 

The app is active and multiple workout sessions have been recorded. 

Test Steps: 

Open the app and log in. 

Record multiple workout sessions (e.g., different activities or step counts). 

Observe how the UI handles and displays these entries. 

Expected Results: 

The UI should remain responsive and update correctly as new entries are recorded. 


Test Case 5: Graph Display for Multiple Workouts 

Test Case ID: TC010 

Description: Verify that the app displays multiple workout sessions correctly on the graph. 

Preconditions: 

The user has multiple workout sessions recorded. 

Test Steps: 

Open the app and log in. 

Record various workout types (e.g., walking, cycling, running). 

Navigate to the graph section. 

Ensure that the graph shows all the workout data clearly. 

Expected Results: 

The graph should accurately display multiple workout sessions, with different workout types easily distinguishable. 


**Manpreet Kaur - Security Testing**

Test Case 1: OAuth Login Flow 

Test Case ID: TC011 

Description: Validate the OAuth login process. 

Preconditions: 

The app is configured to use OAuth for login. 

The user has an OAuth-compatible account 

Test Steps: 

Open the app and click the OAuth login button. 

Select an OAuth provider 

Enter the login credentials and authenticate. 

Confirm successful login and redirection to the app's home screen. 

Expected Results: 

The user should be successfully logged in via OAuth and redirected to the home screen. 


Test Case 2: Token Expiry and Refresh 

Test Case ID: TC012 

Description: Test the token expiration and refresh functionality. 

Preconditions: 

The user is logged in with a token-based authentication system. 

The token has a known expiration time. 

Test Steps: 

Open the app and log in using OAuth. 

Wait for the token to expire (or simulate token expiration). 

Try to perform an action (e.g., sync data). 

Confirm that the app refreshes the token automatically and allows the action to proceed. 

Expected Results: 

The app should automatically refresh the expired token and allow the user to perform actions without re-login. 


Test Case 3: Data Encryption in Transit 

Test Case ID: TC013 

Description: Test data encryption during transmission. 

Preconditions: 

The app is connected to an external API  

Test Steps: 

Open the app and log in. 

Sync data with an external API or device. 

Use a network monitoring tool to inspect the data transmitted between the app and the API. 

Expected Results: 

The data transmitted should be encrypted using a secure protocol such as HTTPS. 


Test Case 4: SQL Injection Vulnerability 

Test Case ID: TC014 

Description: Test if the app is vulnerable to SQL injection attacks. 

Preconditions: 

The app uses a backend database. 

Test Steps: 

Open the app and navigate to the login or data entry form. 

Enter malicious SQL injection code into input fields (e.g., login form). 

Try to submit the form. 

Expected Results: 

The app should prevent any SQL injection attempts and reject any malicious input. 

The app should not expose any data or allow unauthorized access through SQL injection. 


Test Case 5: Session Expiry and Re-authentication 

Test Case ID: TC015 

Description: Verify the app's handling of session expiry and the re-authentication process for users who are inactive. 

Preconditions: 

The user is logged in via OAuth or another authentication method. 

The app has a specified session timeout period  

Test Steps: 

Log in to the app using OAuth or other credentials. 

Remain inactive for the entire session timeout period  

After the session has expired, try to access a feature that requires authentication (e.g., syncing data, viewing profile). 

Check if the app requires the user to log in again or authenticate. 
 
Expected Results: 

Once the session times out, the app should prompt the user to log in again before allowing access to any secured features. 

The app should restrict access to sensitive features after the session ends. 

 **Risk Analysis Document**

1. Calorie Calculation (TC001, TC004) 

Risks of inaccurate calorie calculations include high step count issues and potential impact on health decisions. Mitigation strategies include testing with extreme step counts and validating the calorie calculation formula to ensure correct calculations. 

2. Syncing with External APIs (Google Fit and Apple Health) (TC002, TC005) 

Risks include synchronization issues, data mismatches, and incorrect external platform syncing. Potential impact includes user frustration and app's reduced usefulness. Mitigation strategies include error handling, thorough testing with Google Fit and Apple Health integrations, and retry options. 

3. API Integration for External Devices (TC003) 

Risks include failed external device connections and incorrect step data retrieval, potentially limiting app functionality and causing user dissatisfaction. Mitigation strategies include testing multiple devices, adding error handling, and conducting regular API integration tests to ensure compatibility. 

4. Security Risks (OAuth Login, SQL Injection, Token Expiry) (TC011, TC012, TC013, TC014, TC015) 

Risks identified include OAuth login issues, potential SQL injection vulnerabilities, token expiration and automatic refresh problems, and lack of encryption in data transmission. Potential impacts include unauthorized access to personal data and damage to the app's reputation. Mitigation strategies include penetration testing, encrypted data transmission, multi-factor authentication, SQL injection prevention, and token refresh functionality testing. 

5. Session Management and Authentication (Session Expiry, Re-authentication) (TC015) 

Risks include session expiration issues, user logout issues, and disruptive re-authentication processes. Potential impacts include frustration and loss of important user data. Mitigation strategies include clear warnings, smooth re-authentication, and thorough testing of session management functionality. 

 
**Risk Prioritization**

High risk areas include inaccurate data, data sync failure, security flaws, medium risk with API integration for external devices, UI responsiveness, and low risk with session management. These issues can lead to user dissatisfaction, privacy breaches, device sync issues, and session timeout issues. 

**Code Review Process**

A peer code review is a collaborative process where team members assess each other's code to ensure high quality, adherence to coding standards, and early detection of issues. Participants include Saurav Gyawali, Abijith, and Manpreet Kaur. The review process includes preparation, meeting, and feedback. Participants review code in modules such as Calorie Calculation Logic, Google Fit & Apple Health Sync, External API Integration for Device Sync, and User Authentication & Security. 

The peer review process identified key issues and resolved them, ensuring code quality, security, collaboration, and early detection of defects. Next steps include integration and functional testing and planning another peer review for new features. 

 
**Challenges Faced and Solutions Applied:** 

OAuth Flow: The flow would not work properly, failing to handle the token in some cases. Solution: We fixed the refresh mechanism so that tokens do not get expired unexpectedly.  

UI Automation: Due to the dynamic nature of the app, UI tests were tricky-like live updates to graphs. Solution: We made sure the test scripts could handle live data updates and sync correctly with the UI. 

API Integration: The problem of syncing data from the external APIs was noticed. Solution: We mapped app data with API data so that consistency can be maintained. 


**GitHub Commits:**  

Saurav: Committed the unit tests for calorie calculation and syncing. 

Abijith: Committed the UI test code for step count and graph updates. 

Manpreet: Committed updates for OAuth testing and encryption checks. 


### References 
Some of the idea for testing were generated using ChatGPT, an AI language model 
developed by OpenAI. https://chatgpt.com/ 





