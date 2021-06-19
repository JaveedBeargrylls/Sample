package line.comparision;
import java.util.Scanner;
public class LineComparision {
	String name;
	int i;
	int j;
	public boolean equals(Object o1,Object o2)
	{
		if(o1.equals(o2)){
			System.out.println("line1 and line2 are equal");
		}else {
			System.out.println("line1 and line2 are not equal");
		}
		return false;
		
	}
@SuppressWarnings("deprecation")
public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enter the value = ");
	 int line1 = sc.nextInt();
	 System.out.print("enter the value = ");
	 int line2 = sc.nextInt();
	LineComparision obj = new LineComparision();
	
//	LineComparision obj1 = new LineComparision();
	
	Integer obj1 = new Integer(line1);
	Integer obj2 = new Integer(line2);
	int ans = obj1.compareTo(obj2);
	obj.equals(line1,line2);
	System.out.println(ans);
	sc.close();
	}

}