// User function Template for Java
class Solution {
    public static void utility(int a, int b, int operator) {

        // write your code here
        int result;
        switch(operator){
            case 1:
                result = a+b;
                System.out.print(Integer.toString(result));
                break;
            case 2:
                result = a-b;
                System.out.print(Integer.toString(result));
                break;
            case 3:
                result = a*b;
                System.out.print(Integer.toString(result));
                break;
            default:
                System.out.print("Invalid Input");
                break;
        }
    }
}
