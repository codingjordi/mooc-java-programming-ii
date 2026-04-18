
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        
        CustomTacoBox tacobox = new CustomTacoBox(6);
        
        tacobox.eat();
        tacobox.eat();
        
        System.out.println(tacobox.tacosRemaining());
    }
}
