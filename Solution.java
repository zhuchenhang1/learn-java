class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] arr = s.toCharArray();
        int count = n % arr.length;
        String A=s.substring(count) + s.substring(0, count);
      return A;
    }

    public static void main(String[] args) {
Solution s=new Solution();
s.reverseLeftWords("abcdef",4);
    }
}