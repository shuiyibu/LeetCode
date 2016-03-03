/**
 * 
 */
package array;

/**
 * @author langdylan
 *
 *         Mar 3, 2016 11:21:49 PM
 * 
 *         Given an array and a value, remove all instances of that value in
 *         place and return the new length. The order of elements can be
 *         changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement
{
	public int removeElement(int[] nums, int val)
	{
		int len = nums.length, newLength = 0;
		for (int i = 0; i < len; i++)
		{
			if (nums[i] == val)
			{
				continue;
			}
			nums[newLength] = nums[i];
			newLength++;
		}
		return newLength;
	}

}
