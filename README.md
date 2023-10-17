# GYM APP - CLEAN CODE - TESTING
### PROBLEM STATEMENT

A gym wants a computerized system to control and monitor the sports and disciplines offered to its members.
The same discipline can have several groups at different times.
The members can choose the disciplines and register to one or more groups.

There are two types of groups:
- Free, with a limit of 20 members.
- Controlled, has a quota limit of 20 members whose attendance is controlled.

### HOW TO RUN
In order to excecute the application it's necesary to have installed
- Maven >= 3
- Java > 7

In the proyect folder, execute 
```
mvn clean install
```

After that, a file called gym-project-1.0-SNAPSHOT is generated in the target folder target. You can execute the app with the followwing command
```
java -jar ./target/gym-project-1.0-SNAPSHOT
```

To run the tests execute
```
mvn test
```

FInally, if you want to know kwnow the coverage run
```
mvn jacoco:report
```

Inside the folder target a new folder called site will be generated, open the index.html to view the report
