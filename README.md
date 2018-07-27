# my-trains
The application's purpose is to return the distance of a route in a railway system given a route of 2 or more towns as input. 
A directed graph is used to represent the railway network with 
 - nodes representing towns
 - edges representing tracks between two towns
 - weighting of the edges representing the distance between 2 towns.

##Prerequisites
Java 8

##Running the tests
Unit Test cases have been written using JUnit 4.

```
mvn clean verify 
```

##Running the app
Run RailwayRunner.java inside main.java.com.thoughtworks.katas package.

##Built With
Maven 

```
mvn package
```

A sample input file to create the graph would be like this:
```
AB5
BC4
CD8
DC8
DE6
AD5
CE2
EB3
EB3
AE7
```
A sample input file to the distance of a route would be like this:
```
ABC
AD
ADC
AEBCD
AED
```
Corresponding output to this would be as given below :
```
Output #1: 9
Output #2: 5
Output #3: 13
Output #4: 22
Output #5: No such route
```

##License
This project is licensed under the MIT License - see the LICENSE file for details