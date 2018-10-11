
/*给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。*/

class twoSum {
    public int[] twoSum(int[] nums, int target) {
 	int res[] = new int[2];
	for (int i = 0; i < arr.length; i++) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] + arr[j] == target) {
				res[0] = i;
				res[1] = j;
				return res;
			}
		}
	}
	return res;       
    }
}
