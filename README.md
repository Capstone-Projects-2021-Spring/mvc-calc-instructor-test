# MVC-Calculator
MVC-Calculator is a Java example using the MVC design pattern to simulate a simple calculator. This calculator has two views a graphical user interface (GUI) using Java Swing and a command line interface (CLI). 

![](doc/CalculatorApp.png)

CLI interface: 
```
gradle build
java -jar calculator/build/libs/calculator.jar 1+2=
3
```


# Running with the Graphical User Interface
From a Java IDE run the main() from Calculator.java. 

From the command line do: 

```
gradle run 
```


# Running with the Command Line Interface
To test the command line interface set the "args" parameter in your IDE to a string representing the sequence of keys to pres like 1+2=. Or do it form the command line:     
```
gradle build
java -jar calculator/build/libs/calculator.jar 1+2=
3
```
Note that the result of "3+4" will correctly be 4. As when using the calculator after pressing the key 4 the display will show 4, 7 will only by diplayed after pressing =. 
```
gradle build
java -jar calculator/build/libs/calculator.jar 3+4
4
java -jar calculator/build/libs/calculator.jar 3+4=
7
```

# Development

Use your favorite Java IDE to edit, build, run and test. 

 or do it on the command line with gradle. 
```
gradle build
gradle test
gradle run 
```

[Class diagram](doc/architecture.md) with architecture.


# Use Rally intgration with Pull Request (third time)

Instructions for Broadcom Rally and Github integration:
https://techdocs.broadcom.com/us/en/ca-enterprise-software/agile-development-and-management/rally-platform-ca-agile-central/rally/integrating-top/connectors/source-code-integrations/rally-bot-github-app-integration/using-rally-bot-github-app-integration.html




