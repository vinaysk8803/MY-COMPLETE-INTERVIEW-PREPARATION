package STACK;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class maxEvenNumbersLeetcodeContest {
    static List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum%2 !=0){
            List<Long> list = new ArrayList<>();
            return list;
        }
        Stack<Long> st = new Stack<>();
        long a = 2;
        while(true){
            st.push(a);
            finalSum = finalSum -a;
            a+=2;

            if(finalSum == 0){
                break;
            }
            if(finalSum <a ){
                finalSum += st.peek();
                st.pop();

            }
        }
        List<Long> l = new ArrayList<Long>();
        while(!st.isEmpty()){
            l.add(0,st.pop());

        }
        return l;
    }

    public static void main(String[] args) {
        List<Long> l = new ArrayList<Long>();
        List<Long> l1 = new ArrayList<Long>();
        List<Long> l2 = new ArrayList<Long>();
        l1 = maximumEvenSplit(233655666);
        l2 = maximumEvenSplit(44);
        l = maximumEvenSplit(122);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l);

    }
}
