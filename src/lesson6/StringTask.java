package lesson6;

import java.util.Stack;

public class StringTask {

    public static void main (String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public static int maxDepth(String sentence) {

        int count=0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i) == '(')
                stack.push(i);
            else if(sentence.charAt(i) == ')')
            {
                if(count < stack.size())
                    count = stack.size();
                stack.pop();
            }
        }
        return count;
    }
}
