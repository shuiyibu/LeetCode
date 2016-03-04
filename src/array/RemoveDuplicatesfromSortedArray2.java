/**
 * 
 */
package array;

/**
 * @author LJT
 *
 *         2016年3月4日 下午4:51:25
 */
public class RemoveDuplicatesfromSortedArray2
{
	public int removeDuplicates(int[] nums)
	{
		int len = nums.length;
		if (len == 0)
		{
			return 0;
		}

		final int DUPLICATES = 1;
		int duplicate = 0;

		int j = 0;
		for (int i = 1; i < len; i++)
		{
			if (nums[i] != nums[j])
			{
				nums[++j] = nums[i];
				duplicate = 0;
			}
			else
			{
				if (duplicate < DUPLICATES)
				{
					nums[++j] = nums[i];
				}
				duplicate++;

			}

		}

		return j + 1;

	}
}
