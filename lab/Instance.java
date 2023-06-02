package lab;

//qn 2

public class Instance {
    public int count = 0;
    private int number = 5;
    static String str = "";

 // 2 constructors
    Instance() {
        System.out.println("1st constructor call");

    }
    Instance(int count) {
        System.out.println("2nd constructor call with 1 aurgment");
        
    }
    
    //2 instance methods
    public int getNumber() {
        return number;
    }

    public void setCount(int count2) {
        count = count2;
    }

    // 2 static methods
    public static void printNum() {
        System.out.println("1st static method");
    }

    public static void printNum2() {
        System.out.println("2st static method");
    }
    
    // Instance Initialization Block
    {
        System.out.println("1st Instance Initialization block");
    }

    // Instance Initialization Block
    {
        System.out.println("2nd Instance Initialization block");
    }

    //2 static initialization block
    static
    {
         System.out.println("1st Static Initialization block");
    }
    static
    {
        System.out.println("2nd Static Initialization block");
    }
    
}

