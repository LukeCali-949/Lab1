package Lab1;

import java.util.Arrays;
import java.util.Stack;

public class Problems {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public int[] problem1(int[] numbers, int target) {
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i] +numbers[j]==target){
                    return new int[]{i ,j};
                }
            }
        }
        int[] emptyArray = new int[]{};
        return emptyArray;
    }
    public boolean problem2(int x) {
        String str= String.valueOf(x);
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }

        }
        return true;
    }

    public String problem3(String[] strArr) {

        String prefix = strArr[0];

        for(int i=1; i< strArr.length; i++){
            String str = strArr[i];
            if(prefix.length()>str.length()){
                String tempStr = prefix;
                prefix = str;
                str=tempStr;
            }

            //loop thru string and compare to prefix
            for(int j=0; j<prefix.length(); j++){
                if(prefix.charAt(j)!=str.charAt(j)){
                    if(j==0){
                        return "";
                    }else{
                        prefix = prefix.substring(0,j);
                        break;
                    }

                }
            }
        }

        return prefix;
    }

    public int problem4(String str) {
        int n = str.length();
        int numVal=0;
        for(int i = 0; i<n;i++)
        {
            if(str.charAt(i)=='C')
            {
                if(i<n-1 && str.charAt(i+1)=='M')
                {
                    numVal+=900;
                    i++;
                }
                else if(i<n-1 && str.charAt(i+1)=='D')
                {
                    numVal+=400;
                    i++;
                }
                else
                {
                    numVal+=100;}
            }
            else if(str.charAt(i)=='X')
            {
                if(i<n-1 && str.charAt(i+1)=='C')
                {
                    numVal+=90;
                    i++;
                }
                else if(i<n-1 && str.charAt(i+1)=='L')
                {
                    numVal+=40;
                    i++;
                }
                else
                {numVal+=10;}
            }
            else if(str.charAt(i)=='I')
            {
                if(i<n-1 && str.charAt(i+1)=='X')
                {
                    numVal+=9;
                    i++;
                }
                else if(i<n-1 && str.charAt(i+1)=='V')
                {
                    numVal+=4;
                    i++;
                }
                else
                {numVal+=1;}
            }
            else if(str.charAt(i)=='M')
            {
                numVal+=1000;
            }
            else if(str.charAt(i)=='D')
            {
                numVal+=500;
            }
            else if(str.charAt(i)=='L')
            {
                numVal+=50;
            }
            else if(str.charAt(i)=='V')
            {
                numVal+=5;
            }



        }
        return numVal;
    }

    public boolean problem5(String str) {
        Stack<Character> characterStack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch =='['){
                characterStack.push(ch);
            }
            else{
                if(characterStack.isEmpty()){
                    return false;
                }else{
                    if((characterStack.peek() == '[' && ch ==']')||(characterStack.peek() == '(' && ch ==')')||(characterStack.peek() == '{' && ch =='}')){
                        characterStack.pop();
                    }
                    else{
                        return false;
                    }
                }

            }
        }
        if(characterStack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public class Problem6Node {
      int val;
      Problem6Node next;
      Problem6Node() {}
      Problem6Node(int val) { this.val = val; }
      Problem6Node(int val, Problem6Node next) { this.val = val; this.next = next; }

        // method to print to string for test cases:
        public String printList() {
            return val + (next != null ? "->" + next.printList() : "");
        }
  }

    public Problem6Node problem6(Problem6Node list1, Problem6Node list2) {
        if(list1!=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                list1.next =  problem6(list1.next,list2);
                return list1;
            }
            else if(list1.val >= list2.val)
            {
                list2.next = problem6(list1,list2.next);
                return list2;
            }
        }
        if(list1 == null){
            return list2;
        }else{
            return list1;

        }

    }

    public int[] problem7(int[] digits) {
        int nonNineIndex = digits.length - 1;
        while (nonNineIndex >= 0 && digits[nonNineIndex] == 9) {
            nonNineIndex--;
        }


        if (nonNineIndex == -1) {

            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            int[] result = new int[digits.length];

            for (int i = 0; i < nonNineIndex; i++) {
                result[i] = digits[i];
            }

            result[nonNineIndex] = digits[nonNineIndex] + 1;

            return result;
        }
    }




}
