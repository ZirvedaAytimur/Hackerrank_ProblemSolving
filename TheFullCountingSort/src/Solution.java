import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> index_Map = new HashMap<>();
        int[] count = new int[100];
        for(int i=0;i<s;i++){
            int key = in.nextInt();
            count[key]++;
            String value = in.next();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
                index_Map.put(key, new ArrayList<>());
            }
            index_Map.get(key).add(i);
            map.get(key).add(value);
        }

        int mid = s/2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < 100;i++ )
        {
            if(map.containsKey(i)){
                for(int j = 0;j < map.get(i).size();j++){
                    int index = index_Map.get(i).get(j);
                    String string = map.get(i).get(j);
                    if(index < mid)
                        sb.append("-").append(" ");
                    else
                        sb.append(string).append(" ");
                }
            }
        }
        System.out.println(sb.toString());
    }
}