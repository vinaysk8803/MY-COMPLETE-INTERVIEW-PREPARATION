package Hashmap;

import java.util.*;

// max no of boxes to be filled
 class JpMorgan {

    public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        Queue<Long> pq = new PriorityQueue<>();
        long total = 0;
        long b = boxes.size();
        long u = unitsPerBox.size();
//        if( b == 1 && u == 1 && truckSize == 1){
//            return unitsPerBox.get(0);
//        }
        for(int i = 0; i<b;i++){
            total += boxes.get(i);
        }
        List<Long> allbox = new ArrayList<>();
        for(int i = 0;i<unitsPerBox.size();i++){
            for(int j = 0; j<boxes.get(i);j++){
                allbox.add(unitsPerBox.get(i));
            }
        }
        long k = truckSize;
        for(int i = 0;i<allbox.size();i++){
            pq.add(allbox.get(i));
            if(pq.size()> k){
                pq.poll();
            }
        }
        long ans = 0;

       while (!pq.isEmpty()){
            ans+= pq.peek();
//           System.out.println(pq.peek());
            pq.poll();
        }

        return ans;
    }
    public static String  complement(String s){
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        char arr[] = st.toString().toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 'A'){
                //A -> M
                arr[i] = 'M';
            }else if(arr[i] == 'M'){
                //A <- M
                arr[i] = 'A';
            }else if(arr[i] == 'G'){
                //G-> T
                arr[i] = 'T';
            }else if(arr[i] == 'T'){
                //T ->  G
                arr[i] = 'G';
            }
        }
        return new String(arr);
    }
     public static  String EvenLength(String s){
        String arr[] = s.split(" ");

        String ans = "";
        int max = -1;
        for(int i= 0;i<arr.length;i++){
            int len = arr[i].length();
            if(len>max && len%2==0){
                max = len;
                ans = arr[i];
            }
        }
        return ans;
     }

    static class Pair{
        long size;
        long val;
        Pair(long a,long b){
            size = a;
            val = b;
        }
    }
    public static long getMaxUnit(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        int n = boxes.size();
        ArrayList<Pair> arr = new ArrayList<Pair>();
        for (int i = 0;i<n;i++){
            arr.add(new Pair(boxes.get(i),unitsPerBox.get(i)));
        }
        Collections.sort(arr,(a,b)-> {
            return (int) (b.val - a.val);
        });

        long total = 0;
        long max = truckSize;
        int p = 0;
        while(max>0 && p<n){
            long box = arr.get(p).size;
            if(box>max){
                box = max;
                max-= box;
            }
            total += arr.get(p).val * box;
            max-= box;
            p++;

        }
        return total;
    }
     public static void main(String[] args) {
         //Compelment of A is M
         // compelement of G is T
         // reverse the string and replace element by its complement;
//         String s = "ATTGMATAGAGA";
//         System.out.println(s);
//         String ans = complement(s);
//         System.out.println(ans);
//         System.out.println(complement(ans));

         // boxes 2,3,5
         // unitsPerBoxes  4 2 5
         // truct size 6
         // we have to find max number of profit boxes can take and boxes < truck size
         // basically we have to put max profix box in truck
         List<Long> boxes = new ArrayList<>();
         boxes.add(4785447L);
         boxes.add(44434782L);
         boxes.add(7894632544L);
         boxes.add(123475464L);
         boxes.add(12345747L);
         boxes.add(2364784953L);
         boxes.add(14984644650L);
         List<Long> unitsPerBoxes = new ArrayList<>();
         unitsPerBoxes.add(12L);
         unitsPerBoxes.add(4L);
         unitsPerBoxes.add(10L);
         unitsPerBoxes.add(14L);
         unitsPerBoxes.add(17L);
         unitsPerBoxes.add(6L);
         unitsPerBoxes.add(25L);
         Long truckSize = 198944545440L;
//         long ans1 = getMaxUnits(boxes,unitsPerBoxes,truckSize);
//         System.out.println(ans1);
//         long ans2 = getMaxUnit(boxes,unitsPerBoxes,truckSize);
//         System.out.println(ans2);
//         System.out.println(EvenLength("heyy what you doing tonightt i am busy nowdays"));

     }

}

