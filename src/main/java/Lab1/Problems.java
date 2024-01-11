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



}
