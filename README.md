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
Azure DevOps Board: Azure DevOps Board (Insert your link here)
Slack Workspace: Slack Workspace (Insert your link here)

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






