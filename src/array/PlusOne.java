/**
 * 
 */
package array;

/**
 * @author LJT
 *
 *         2016年3月4日 下午5:21:27
 * 
 *         Given a non-negative number represented as an array of digits, plus
 *         one to the number.
 * 
 *         The digits are stored such that the most significant digit is at the
 *         head of the list.
 */
public class PlusOne
{
	public int[] plusOne(int[] digits)
	{
		int len = digits.length;
		int addend = 1;
		for (int i = len - 1; i >= 0; i--)
		{
			int augend = digits[i];
			int sum = augend + addend;
			if (sum > 10)
			{
				digits[i] = sum % 10;
				augend = sum / 10;

			}
			else
			{
				break;
			}
		}

		return digits;
	}
}
