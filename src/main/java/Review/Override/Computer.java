package Review.Override;

public abstract class Computer {
    public static String type;
    public String name;
    protected int memory;
    String color;


    public Computer(String name, int memory, String color) {
        this.name = name;
        this.memory = memory;
        this.color = color;
    }

    public static void playMusic() {
        System.out.println("I can play music on my " + type);
    }

    protected void printInfo() {
        System.out.println("I have " + name + "computer with " + memory + "memory  ");
    }

    abstract void executedCode();

    abstract void readEmail();

}

class Apple extends Computer {
    public Apple(String name, int memory, String color) {
        super(name, memory, color);
    }
    void executedCode(){
        System.out.println("Executed "+type+" "+name);
    }
void readEmail(){
    System.out.println(name+"can read my email");

}
}
