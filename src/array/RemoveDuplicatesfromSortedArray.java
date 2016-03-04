/**
 * 
 */
package array;

/**
 * @author LJT
 *
 *         2016年3月4日 下午4:09:14
 * 
 *         Given a sorted array, remove the duplicates in place such that each
 *         element appear only once and return the new length.
 * 
 *         Do not allocate extra space for another array, you must do this in
 *         place with constant memory.
 */
public class RemoveDuplicatesfromSortedArray
{
	public int removeDuplicates(int[] nums)
	{
		int len = nums.length;
		int k = 1;
		for (int i = 0, j = 1; j < len; j++)
		{
			if (nums[i] == nums[j])
			{

				continue;
			}
			nums[k] = nums[j];

			k++;
			i = j;
		}

		return k;
	}

	public int removeDuplicates2(int[] nums)
	{
		int len = nums.length;

		if (len == 0)
		{
			return 0;
		}

		int j = 0;

		for (int i = 1; i < len; i++)
		{
			if (nums[i] != nums[j])
			{
				nums[++j] = nums[i];//Notify the difference between "++j" and "j++"

			}
		}

		return j + 1;
	}
}
