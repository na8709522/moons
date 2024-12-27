 public class Main {
 // Static method
 static void myStaticMethod() {
 System.out.println("Static methods can be called without creating objects");
 }
 public void fullThrottle() {
 System.out.println("The car is going as fast as it can!");
 }
 public void speed(int maxSpeed) {
 System.out.println("Max speed is: " + maxSpeed);
 }
 }
 public class Test {
 public static void main(String[] args) {
 Main.myStaticMethod(); // Call the static method
 Main myCar = new Main();   
myCar.fullThrottle();    
myCar.speed(200);  
}
 }