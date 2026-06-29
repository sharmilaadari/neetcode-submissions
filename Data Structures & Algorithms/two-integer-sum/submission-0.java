class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int tar=target-nums[i];
            if(hm.containsKey(tar)){
              arr[0]=hm.get(tar);
              arr[1]=i;
              return arr;
            }
            else{
                hm.put(nums[i],i);
            }
        }
return arr;
    }
}
