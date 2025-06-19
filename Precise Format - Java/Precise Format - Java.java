import java.util.ArrayList;
class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> result = new ArrayList<>();
        float exact = a/b;
        float rounded = Math.round(exact*1000.f)/1000.f;
        result.add(exact);
        result.add(rounded);
        return result;
    }
}
