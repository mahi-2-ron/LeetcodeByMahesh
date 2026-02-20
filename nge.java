import java.util.*;

class nge{
    public static int[] nextGreater(int []nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            //pop all the smaller or equal elements
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            // if stack is empty no greater element 
            if(st.isEmpty()) res[i] = -1;

        // else top of stck is the answer 
        else res[i] = st.peek();
        st.push(nums[i]);
        

        }
        return res;
    }
    public static void main(String []args){
        int[] nums = {4, 5, 2, 10};
        int[] ans = nextGreater(nums);
        for(int x : ans){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}