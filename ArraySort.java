package Week.day2;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
int a[] = {5,9,2,7,25,97,45,112,69};
int b = a.length;
System.out.println("Before sorting :");
for (int i = 0; i < b; i++) {
	System.out.println(a[i]);
}
System.out.println("Afer sorting :");
Arrays.sort(a);
for(int i=0;i<b;i++)
{
	System.out.println(a[i]);
}
	}

}
