package MultiDiamentinalArray;

public class Program {
	public static void main(String[] args) {
		
//		   0  1  2  3
//		0 45 46 47 48 
//		1 49 50 51 52 
//		2 53 54 55 56
//		
		
		
		int arr[][]= new int [3][4];
		
		arr[0][0]=45;                                
		arr[0][1]=46;
		arr[0][2]=47;
		arr[0][3]=48;
		arr[1][0]=49;
		arr[1][1]=50;
		arr[1][2]=51;
		arr[1][3]=52;
		arr[2][0]=53;
		arr[2][1]=54;
		arr[2][2]=55;
		arr[2][3]=56;
		
		
		for(int i=0;i<=2;i++) //...outer loop for row
		{
			for(int j=0;j<=3;j++)//.......inner loop for column
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println(arr[1][3]);
		
		
		
		
		
	}

}
