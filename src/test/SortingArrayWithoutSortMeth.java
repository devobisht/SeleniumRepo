package test;

import java.util.Arrays;

public class SortingArrayWithoutSortMeth {

	public static void main(String[] args) {
		
		int [] arr= new int[] {6,3,7,4,8};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		int count=0;
		if(arr[i]<arr[j]) {    //use > for assending order
			count=arr[i];
			arr[i]=arr[j];
			arr[j]=count; 
			
		}	
		}
	    }	
System.out.println(Arrays.toString(arr));
		}

}