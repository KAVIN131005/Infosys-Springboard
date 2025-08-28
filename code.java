Q1. Declare and print variables in Java

public class VariablesExample {
    public static void main(String[] args) {
        // Declaring variables of different types
        int age = 20;
        double marks = 85.5;
        char grade = 'A';
        String name = "Kavin";
        boolean isPassed = true;

        // Printing variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
    }
}
OUTPUT: 
Name: Kavin
Age: 20
Marks: 85.5
Grade: A
Passed: true

Q2. Use if-else

public class IfElseExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}

OUTPUT:
The number is positive

Q3. Use switch-case

public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;  // 1=Monday, 2=Tuesday...

        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }
    }
}

OUTPUT: 
Wednesday


Q4. For loop

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

OUTPUT:

Count: 1
Count: 2
Count: 3
Count: 4
Count: 5

Q5. While loop


public class WhileExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }
    }
}

Output:

Number: 1
Number: 2
Number: 3
Number: 4
Number: 5


Q6. Do-while loop

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Value: " + i);
            i++;
        } while (i <= 5);
    }
}
OUTPUT:
Value: 1
Value: 2
Value: 3
Value: 4
Value: 5


Q7. OOPS – Class and Object

class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Student s1 = new Student("Kavin", 20);
        Student s2 = new Student("DHARSHAN", 21);

        s1.displayInfo();
        s2.displayInfo();
    }
}

OUTPUT:
Name: Kavin, Age: 20
Name: DHARSHAN, Age: 21
