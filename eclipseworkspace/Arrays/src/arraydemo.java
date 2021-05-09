
public class arraydemo {

	public static void main(String[] args) {
		//int arr[] = {10,20,30,40,50};
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = new Integer(30);
		arr[3] = 40;
		System.out.println("Elements of array :");
		//for(int i = 0; i < arr.length; i++){
		//	System.out.println(arr[i]);
		//}
		for(int element : arr){
			System.out.println(element);
			
		}

	}

}
