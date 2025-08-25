class Solution {
    public ArrayList<Integer> kLargest(int[] nums, int k) {
        // Your code here
          PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
          pq.add(nums[i]);
          if(pq.size()>k){
            pq.poll();
          }
        }
       ArrayList<Integer> al = new ArrayList<>();
       while(pq.size()>0){
           al.add(pq.poll());
       }
       Collections.reverse(al);
       return al;
    }
}
