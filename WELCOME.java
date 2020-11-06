import java.util.*;

public class WELCOME {
    public static void main(String[] args) throws InterruptedException {
        int count = 1;
        while(true){
            if (count==1){
                System.out.println("Welcomed you to Webb already 1 time!        (Press Ctrl+C to break...)");
            }else{
                System.out.println("Welcomed you to Webb already " + count + " times!        (Press Ctrl+C to break...)");
            }
            count+=1;
            Thread.sleep(100);
        }
    }
}