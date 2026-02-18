public class MoveZerosLast {
	public static void main(String[] args) {
		int arr[]={1,0,0,3,4,20,2};
		Move(arr);
		print(arr);

	}
	public static void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void swap(int arr[],int i,int j){
		arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
	}
	public static void Move(int arr[]){
		int i=0;
		for(int j=0;j<arr.length;j++){
			if(arr[j]!=0){
				swap(arr,i,j);
				i++;
			}
		}
	}

}
