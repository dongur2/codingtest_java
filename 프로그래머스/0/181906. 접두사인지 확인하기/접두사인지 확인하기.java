class Solution {
    public int solution(String my_string, String is_prefix) {
        // return my_string.replace(is_prefix, "0").startsWith("0")? 1:0;
        return my_string.startsWith(is_prefix)? 1:0;
    }
}