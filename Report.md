# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].

```mermaid 
```
---
title: Aloha World UML
---
classDiagram
    direction LR
    AlohaWorld --> Greeter
    AlohaWorld --> ConsoleView : uses
    ConsoleView --> Greeter : uses
    
    class AlohaWorld {
        + main(String[] args): void
    }
    
    class Greeter {
        - name : String
        - locality : int
        + Greeter(String name)
        + getName(): String
    }

    class ConsoleView {
    }
    
<img width="852" alt="截屏2025-01-27 00 31 12" src="https://github.com/user-attachments/assets/9e11501b-c8de-45da-a7f6-b17df8f6f66e" />




### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).


So this program starts at the main() method of AlohaWorld. It first call the “ ConsoleView.getName()” to hint the user to input the name, and then store this name to variable “name”.

Then, the program call ConsoleView.getlocality(), to tell user choose a location from given locations.The number selected by the user is stored in the variable locality.

Then, we create an instance of the Greeter class using the user's name and selected location. And the Greeter class will  create a dynamic greeting based on the user's name and location.

The program generate the greeting by calling “Greeter.greet()”method, and this greeting will change based on the user's location. Also the greeting can be outputted through “ConsoleView.printGreeting()”.

The program enters a loop and calls ConsoleView.checkRunAgain() to prompt the user whether to continue running the program. The user enters yes or no to decide whether to run again. If user choose to continue, the program will call the “ConsoleView.getLocatlity()” again to get a new location and  update the locality of the Greeter instance. Then the program will generate new greeting.

When user chooses to exit, the loop will ends, the program ends.


## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   *  `final class`
   * `public static void main(String[] args)`
   * ` String greeting = useAscii ? asciiGreeting : unicodeGreeting`
   * `public void`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
      
   * `public static void main(String[] args)`This is the entry point of a Java program.we must use this signature at the beginning of java.
   * ` String greeting = useAscii ? asciiGreeting : unicodeGreeting`This is a Java expression that uses the ternary operator. The ternary operator is a shorthand for an if-else statement.The useAscii is evaluated as true or false.
   * `public void` actually I do know what dose the public mean, so I just figure out the void: Indicates that the method does not return any value.

3. What does `main` do in Java? 

    I think it's more like a "Door", it's a entry, and all of the program begins here.It's a special method that the java can start working untill JAVA find this method.


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    It's a built-in method inherited from the Object class.It can return a string that we can easy understand/use/print.

5. What is javadoc style commenting? What is it used for?
    Javadoc style commenting is a specific format of writing comments in Java that we can generate HTML documentation directly from the source code. It can generate API Documentation,make code easy to read and understand, and javadoc  provid quick access to relevant information without needing to open additional documentation.

7. Describe Test Driving Development (TDD) in your own words. 

    TDD is a software development approach that we can write tests before writing the actual code. This can ensures that our code does what it’s supposed to do and is easy to maintain.

8. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?
       Because if we want to change something or fix someting, we can just do it in one class, it's easier to find the bug and fix it quickly. And by keeping interaction with the client contained to ConsoleView, we can simulate input/output for testing, while other classes can focus their own logic.


3. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.

    We can store greetings and languages in single file or database instead of hardcoding them in the code. Then, use a loader to read this data and dynamically create Greeting objects. A GreetingManager class can manage these objects, allowing us to fetch, add, or update greetings at runtime without modifying the code. This approach separates data from logic, it makes easier to maintain and change.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.
[^3]:https://ioflood.com/blog/public-static-void-main-string-args/
[^4]:https://www.geeksforgeeks.org/ternary-operator-in-programming/



<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java
