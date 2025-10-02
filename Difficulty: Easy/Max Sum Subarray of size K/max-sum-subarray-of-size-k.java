class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int left=0;
        int sum=0;
        int maxsum=0;
        for(int right=0;right<n;right++){
            sum = sum+arr[right];
            if(right-left+1==k){
                maxsum=Math.max(maxsum,sum);
                sum=sum-arr[left];
                left++;
            }
        }
        return maxsum;
    }
}