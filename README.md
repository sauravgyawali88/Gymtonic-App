# Fitness Tracker App Testing

### Group Information

**Group Members:**
Saurav Gyawali (Student ID: A00301312)
Manpreet Kaur (Student ID: A00307693)
Abijith (Student ID: A00310598)

### Codebase

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

Slack Workspace: Slack Workspace capstoneproje-uvd8251 

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

Code Snippets: 

 
**Challenges Faced and Solutions Applied:** 

OAuth Flow: The flow would not work properly, failing to handle the token in some cases. Solution: We fixed the refresh mechanism so that tokens do not get expired unexpectedly.  

UI Automation: Due to the dynamic nature of the app, UI tests were tricky-like live updates to graphs. Solution: We made sure the test scripts could handle live data updates and sync correctly with the UI. 

API Integration: The problem of syncing data from the external APIs was noticed. Solution: We mapped app data with API data so that consistency can be maintained. 


**GitHub Commits:**  

Saurav: Committed the unit tests for calorie calculation and syncing. 

Abijith: Committed the UI test code for step count and graph updates. 

Manpreet: Committed updates for OAuth testing and encryption checks. 


**Update Azure DevOps Boards:** 

Update Tasks: 

Move completed tasks to "Done". 

Update ongoing tasks with the latest progress. 

Add any new tasks for remaining work. 

### References 
Some of the idea for testing were generated using ChatGPT, an AI language model 
developed by OpenAI. https://chatgpt.com/ 





