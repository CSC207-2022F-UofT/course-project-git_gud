# Project Template

This is a template repository for CSC 207 projects. 
This repository contains starter code for a gradle project.
It also contains workflow documents that give instructions on how to manage your Github repository and how to use Github Projects for efficient collaboration.

## Checklist For Your Project
- [ ] Verify the correct settings for your project repository
- [ ] Set up Github Projects
- [ ] Create the implementation plan using issues and Github Projects
- [ ] Create deveopment branches for your features
- [ ] Use pull requests to merge finished features into main branch
- [ ] Conduct code reviews

**If your team has trouble with any of these steps, please ask on Piazza. For example, with how GitHub Classroom works, your team *may* not have permissions to do some of the first few steps, in which case we'll post alternative instructions as needed.**

## Workflow Documents

* Github Workflow: Please refer to the workflow that was introduced in the first lab. You should follow this when working on your code. The following document provides additional details too.

* [Project Planning and Development Guide](project_plan_dev.md): This document helps you to understand how to create and maintain a project plan for your class project. **This document helps you to complete the Implementation Plan Milestone.**

## Gradle Project
Import this project into your Intellij editor. It should automatically recognise this as a gradle repository.
The starter code was built using SDK version 11.0.1. Ensure that you are using this version for this project. (You can, of course, change the SDK version as per your requirement if your team has all agreed to use a different version)

You have been provided with two starter files for demonstration: HelloWorld and HelloWorldTest.

You will find HelloWorld in `src/main/java/tutorial` directory. Right click on the HelloWorld file and click on `Run HelloWorld.main()`.
This should run the program and print on your console.

You will find HelloWorldTest in `src/test/java/tutorial` directory. Right click on the HelloWorldTest file and click on `Run HelloWorldTest`.
All tests should pass. Your team can remove this sample of how testing works once you start adding your project code to the repo.

Moving forward, we expect you to maintain this project structure. You *should* use Gradle as the build environment, but it is fine if your team prefers to use something else -- just remove the gradle files and push your preferred project setup. Assuming you stick with Gradle, your source code should go into `src/main/java` (you can keep creating more subdirectories as per your project requirement). Every source class can auto-generate a test file for you. For example, open HelloWorld.java file and click on the `HelloWorld` variable as shown in the image below. You should see an option `Generate` and on clicking this your should see an option `Test`. Clicking on this will generate a JUnit test file for `HelloWorld` class. This was used to generate the `HelloWorldTest`.

![image](https://user-images.githubusercontent.com/5333020/196066655-d3c97bf4-fdbd-46b0-b6ae-aeb8dbcf351d.png)

You can create another simple class and try generating a test for this class.

## Feature 1 and 2 Usage
To use these features properly, you must change the file 'build.gradle'. Replace the dependencies section with:
```
dependencies {
    implementation 'junit:junit:4.13.1'
    implementation 'mysql:mysql-connector-java:8.0.28'
    testImplementation('org.junit.jupiter:junit-jupiter:5.6.0')
    implementation 'com.mysql:mysql-connector-j:8.0.31'
 ```
A local SQL database must be used until an online one is formed. The steps are as follows:
1) Download MySQL Workbench.
2) Set your user and password and remember these as you will need to change the code with them accordingly.
3) Add a MySQL connection, hostname should be 127.0.0.1, port 3306, username and password is whatever you setup in the previous step.
4) Open you connection and create a new schema with the name 'JDBC'.
5) From within the schema create a new table called 'USER'.
6) Within table 'USER' open a new query and run the following:
```
ALTER TABLE `jdbct`.`USER` 
ADD COLUMN `username` VARCHAR(45),
ADD COLUMN `password` VARCHAR(45),
ADD COLUMN `email` VARCHAR(45),
ADD COLUMN `bodyfat` INT NOT NULL,
ADD COLUMN `bodyweight` INT NOT NULL;
```
7) Make changes to the code where it says TODO. 

## Feature 6 (Graphing)
The graphing feature produces output on the right input(A LinkedHashMap of Dates and Floats), but a lot still needs to be done to make the graphs look better. At the moment, the axes aren't labeled and only points are plotted. 

Can you also provide feedback on whether the flow of the usecase (from controller to interactor to presenter etc.) had too many classes for this particular use case, and if the GraphResponseModel and GraphRequestModel were necessary.

Also a lot of the latest changes I made (for example the inclusion of JAVADOC) are in the last commit I made and not in the last pull request on the document.

![Screenshot (786)](https://user-images.githubusercontent.com/96087837/203178755-40d391e2-d651-4e50-a318-faa0f36ba13c.png)

