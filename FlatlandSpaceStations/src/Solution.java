import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        // number of cities
        int cityNumber = scanner.nextInt();
        // number of spaceStations
        int stationNumber = scanner.nextInt();

        // cities
        int[] cities = new int[cityNumber];
        for (int i = 0; i < cityNumber; i++){
            cities[i] = i;
        }

        // space stations
        int[] stations = new int[stationNumber];
        for (int i = 0; i < stationNumber; i++){
            stations[i] = scanner.nextInt();
        }

        if (cityNumber == stationNumber){
            System.out.println(0);
        } else {
            int[] minLocal = new int[cityNumber];
            for (int i = 0; i < cityNumber; i++){
                minLocal[i] = Integer.MAX_VALUE;
            }

            int maxDistance = Integer.MIN_VALUE;

            for (int i = 0; i < cityNumber; i++){
                for (int j = 0; j < stationNumber; j++){
                    if (Math.abs(cities[i] - stations[j]) < minLocal[i]){
                        minLocal[i] = Math.abs(cities[i] - stations[j]);
                    }
                }
                if (minLocal[i] > maxDistance){
                    maxDistance = minLocal[i];
                }
            }

            System.out.println(maxDistance);
        }
    }
}

/*
import java.util.Scanner;

// Create a boolean array for the cities. "true" indicates there's a station in the city.
//
// There are 3 cases:
//  - You are at left of 1st station - in this case, you are forced to walk right
//  - You are at right of last station - in this case, you are forced to walk left
//  - You are between 2 stations - you walk to nearest station

// Time complexity: O(n)
public class Solution {
    public static void main(String[] args) {
        */
/* Read input - Create chain of cities *//*

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean[] cities = new boolean[n];
        while (m-- > 0) {
            int station = scan.nextInt();
            cities[station] = true;
        }
        scan.close();

        System.out.println(findMin(cities));
    }

    static int findMin(boolean[] cities) {
        int lastStation = -1;
        int distance    =  0;
        int max         =  0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i]) {
                if (lastStation == -1) { // accounts for being left of 1st station
                    max = i;
                } else { // accounts for being in between 2 stations
                    distance = i - lastStation;
                    max = Math.max(max, distance / 2);
                }
                lastStation = i;
            }
        }
        */
/* Account for being right of last station *//*

        distance = cities.length - 1 - lastStation;
        max = Math.max(max, distance);
        return max;
    }
}*/
