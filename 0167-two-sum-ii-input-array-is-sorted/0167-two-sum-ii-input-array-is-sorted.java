class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int l = 0;
       int r = numbers.length - 1;
        while(l != r){
            if(numbers[l] + numbers[r] > target)
                r--;
            if(numbers[l] + numbers[r] < target)
                l++;
            if(numbers[l] + numbers[r] == target)
                return new int[]{l + 1, r + 1};
        }
        return null;
        
    }
}