// User function Template for Java

class Solution {
    public static int kthSmallest(int[] nums, int k) {
        // Your code here
          PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
          pq.add(nums[i]*-1);
          if(pq.size()>k){
            pq.poll();
          }
        }
        return pq.poll()*-1;
    }
}
    