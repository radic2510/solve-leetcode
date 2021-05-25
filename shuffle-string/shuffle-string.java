class Solution {
    public String restoreString(String s, int[] indices) {
        
        /**
        * 같은 길이의 배열 생성 후
        * 순서에 맞는 자리에 배치
        */
        
        int strLen = s.length();
        char[] charArr = new char[strLen];
        
        for(int i=0; i<strLen; i++){
            charArr[indices[i]] = s.charAt(i);
        }
        
        return new String(charArr);
    }
}