import java.util.Scanner;

public class HourGlass2DArray {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter matrix size");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maxValue = Integer.MIN_VALUE;
        System.out.println("Max value ="+maxValue);
        int total =0;
        int a[][] = new int[x][y];
                System.out.println("Enter array");

        for(int i = 0; i< x; i++){
            for (int j =0; j<y; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i< x; i++){
            for (int j =0; j<y; j++){
                if(i>1 && j>1)
                total = a[i][j] + a[i][j-1] + a[i][j-2]
                        +a[i-1][j-1]
                        +a[i-2][j-2]+a[i-2][j-1]+a[i-2][j];
                        
                if(total>maxValue)
                maxValue = total;
            }
        }
        System.out.println(maxValue);
    }
}
