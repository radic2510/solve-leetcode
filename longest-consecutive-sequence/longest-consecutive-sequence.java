class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;

        Set<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }

        for (int num : num_set) {
            if(!num_set.contains(num - 1)) {	// sequence 시작
                int curNum = num;
                int curSeq = 1;

                while (num_set.contains(curNum + 1)) {
                    curNum++;
                    curSeq++;
                }

                result = Math.max(result, curSeq);
            }
        }

        return result;
    }
}