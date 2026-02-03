class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> trackingList = new ArrayList<>();
        Arrays.sort(nums);
        findSubsets(result, 0, nums.length, trackingList, nums);
        return result;
    }

    public void findSubsets(List<List<Integer>> result, int index, int n, List<Integer> trackingList, int[] nums)
    {
        List<Integer> temp = new ArrayList<>(trackingList);
        result.add(temp);

        for(int i = index; i < n; i++)
        {
            if(i != index && nums[i] == nums[i - 1])    continue;
            trackingList.add(nums[i]);
            findSubsets(result, i + 1, n, trackingList, nums);
            trackingList.remove(trackingList.size() - 1);
        }
    }
}