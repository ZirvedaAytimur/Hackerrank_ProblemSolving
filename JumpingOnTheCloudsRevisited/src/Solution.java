import java.util.Scanner;

public class Solution {

    static int energyCalculation(int[] clouds,int length,int energy,int currentLoc){

        do {
            //first jump it uses 1 energy
            energy--;
            currentLoc=(currentLoc+length)%clouds.length;
            if (clouds[currentLoc]==1)
                energy-=2;

        }while (currentLoc!=0);

        return energy;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //array size
        int size=scanner.nextInt();
        //length of the one jump
        int length=scanner.nextInt();
        //energy
        int energy=100;
        int currentLoc=0;

        //clouds array
        int[] clouds=new int[size];
        for (int i=0;i<size;i++) {
            clouds[i] = scanner.nextInt();
        }

        System.out.println(energyCalculation(clouds,length,energy,currentLoc));
    }
}
