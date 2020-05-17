import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int hour=scanner.nextInt();
        int minute=scanner.nextInt();

        HashMap<Integer,String> words=new HashMap<>();

        words.put(1,"one");
        words.put(2,"two");
        words.put(3,"three");
        words.put(4,"four");
        words.put(5,"five");
        words.put(6,"six");
        words.put(7,"seven");
        words.put(8,"eight");
        words.put(9,"nine");
        words.put(10,"ten");
        words.put(11,"eleven");
        words.put(12,"twelve");
        words.put(13,"thirteen");
        words.put(14,"fourteen");
        words.put(16,"sixteen");
        words.put(17,"seventeen");
        words.put(18,"eighteen");
        words.put(19,"nineteen");

        if (minute==0){
            System.out.println(words.get(hour)+" o' clock");
        }

        else if (minute<30){
            if (minute<20&&minute!=15)
                System.out.println(words.get(minute)+" minute past "+words.get(hour));
            else if (minute==15)
                System.out.println("quarter past "+words.get(hour));
            else System.out.println("twenty "+words.get(minute-20)+" minutes past "+words.get(hour));
        }

        else if (minute>30){
            if (minute==45)
                System.out.println("quarter to "+words.get((hour+1)%12));
            else if (60-minute>20)
                System.out.println("twenty "+words.get(40-minute)+" minutes to "+words.get((hour+1)%12));
            else if (60-minute<20)
                System.out.print(words.get(60-minute)+" minutes to "+words.get((hour+1)%12));
            else System.out.println("twenty ninutes to "+words.get((hour+1)%12));
        }

        else
            System.out.println("half past "+words.get(hour));
    }
}
