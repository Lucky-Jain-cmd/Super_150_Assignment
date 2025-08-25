// User function Template for Java

class Solution {
    public static int kthSmallest(int[] nums, int k) {
        // Your code here
          PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(int i=0;i<nums.length;i++){
          pq.add(nums[i]);
          if(pq.size()>k){
            pq.poll();
          }
        }
        return pq.poll();
    }
}
    