package DSA_Advance;

import java.util.Stack;
 import java.util.function.Function;

 public class stacks {

    public static String balenced(String str ){

        Stack <Character> s1= new Stack<>();

        System.out.println(str);

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(0)==')') return "unbalend=ced string ";
            if (str.charAt(i) == ')' && !s1.isEmpty()){
                s1.pop();
            }else {
                s1.push(str.charAt(i));
            }
        }
       if (s1.isEmpty()){
          return "the string is balanced";
       }else {
           System.out.println("the no of braces to make the string balenced are : " + s1.size());
       }
           return "unbalenced string ";
    }



    public static void main(String[] args) {
        balenced(")((()))");
        System.out.println(balenced("()(((()()"));
        
    }
}
