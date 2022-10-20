package Assignment;

public class InversionCount {
public static void main(String[] args) {
	int arr[]= {1,12,10,3,9,5,6};
	int Count = 1;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
		if(arr[j] >arr[i]) {
		Count ++;
		}
	}
}
	System.out.println(Count);
}
}