public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return maximumTree(nums, 0, nums.length);
    }

    TreeNode maximumTree(int[] nums, int start, int end) {
        if(start == end) {
            return null;
        }
        int pos = start;
        for(int i = start; i < end; i++) {
            if(nums[pos] < nums[i]) {
                pos = i;
            }
        }
        TreeNode root = new TreeNode(nums[pos]);
        root.left = maximumTree(nums,start,pos);
        root.right = maximumTree(nums,pos+1,end);
        return root;
    }
}
