package numberdemo;


public class SecondLargestNo {
	public int secondLargestNoApproch01() {
		int temp;
		int a [] = {999,2,88,4,5,6};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		/*Arrays.sort(a);  
		 * List<Integer> list=Arrays.asList(a);  Collections.sort(list);  
		 * int element=list.get(total-2);  
		 */
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]+" ");
		}
		System.out.println("Second Largest: "+a[a.length-2]);  
		System.out.println("First Largest: "+a[a.length-1]);  
		return a[a.length-2];
	}
	public static void main(String[] args) {
		new SecondLargestNo().secondLargestNoApproch01();
	}

}
