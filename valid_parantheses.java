import java.util.Stack;
public class valid_parantheses{
    public static boolean validParinthses(String s){
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else if(c == ')' || c == ']' || c == '}'){
                if(st.isEmpty()) return false;

                char top = st.pop();
                if((c == ')' && top != '(') ||
                (c == '}' && top != '{') ||
                (c == ']' && top != '[')) return false;     

            }
        }
        return st.isEmpty();
    }
    public static void main(String []args){
        String str = "( )[ { } ( ) ]";
        System.out.println(validParinthses(str));

    }
}