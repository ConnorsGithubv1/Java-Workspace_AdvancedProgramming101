
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	Integer[] nums = {1, 2, 3, 4, 5};
	Integer[] nums2 = {4, 5, 6, 7, 8};
	
	Set<Integer> set1 = new TreeSet<Integer>(Arrays.asList(nums));
	Set<Integer> set2 = new TreeSet<Integer>(Arrays.asList(nums2));
	
	public MathSet()
	{
		System.out.println("set one: " + set1);
		System.out.println("set two: " + set2);
	}

	public Set<Integer> union()
	{
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(set1);
		union.addAll(set2);
		return union;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> intersect = new HashSet<Integer>();
		intersect.addAll(set1);
		intersect.addAll(set2);
		intersect.retainAll(set1);
		intersect.retainAll(set2);
		return intersect;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(set1);
		a.addAll(set2);
		a.removeAll(set2);
		return a;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(set1);
		b.addAll(set2);
		b.removeAll(set1);
		return b;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> b = new HashSet<Integer>();
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(set1);
		a.addAll(set2);
		a.retainAll(set1);
		a.retainAll(set2);
		
		b.addAll(set1);
		b.addAll(set2);
		b.removeAll(a);
		return b;
	}	
	
}
