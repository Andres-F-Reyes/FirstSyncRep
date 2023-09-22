/**
 *
 * @author ANDRES R
 */
public class FizzBuzz {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Primero ejecutaremos el algoritmo corriendolo directamente desde la main class usando Programación Estructurada:");
        for (int i = 1; i <= 100; i++) {//Programación estructurada
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
               System.out.println(i);
            }
        }
    }
    
}