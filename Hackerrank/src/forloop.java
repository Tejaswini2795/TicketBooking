import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        String s = scan.nextLine();
		        // Write your code here.
		       
		        s = s.trim();
		        String arr[] = s.split("[ !,?._'@]+");
		        System.out.println(arr.length+"000");
		        if(arr.length == 0){
		            System.out.println(0);
		        }else{
		        for(int i=0; i<arr.length; i++){
		            System.out.println(arr[i]);
		        }
		        }
		        scan.close();
		    
	}
}
