import java.util.*;
public class in {

    public static void main(String[] args) {
		
	// 	int a[][]=new int[2][3];
		
	// 	Scanner scan=new Scanner(System.in);
	// 	for(int i=0;i<a.length;i++) {
	// 		for(int j=0;j<a.length;j++) {
	// 			a[i][j]=scan.nextInt();
	// 		}
	// 	}
		
	// 	for(int i=0;i<a.length;i++) {
	// 		for(int j=0;j<a.length;j++) {
	// 			System.out.print(a[i][j]);
	// 		}
	// 	}
		
	// }
    
    // for(int i=0;i<a.length;i++) {
	// 		for(int j=i;j<0;j--) {
    //             a[i]=a[i]+a[j-1];
    //         }
    //     }
    //     System.out.println(a[2]);
        // int a[]={2,4,6,8};
        // for(int i=a.length-1; i>=0;i--){
        //     if(a[i] %  2==0){
        //         a[i]=a[i]+i;
        //     }
        //     else{
        //         a[i]=a[i]-i;
        //     }
        // }
        // for(int j:a){
        //     System.out.println(j);
        
        int a[]={1,2,3,4};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                a[i]+=a[j];
            }
        }
        System.out.println(a[3]);
// a[0]=>10 10+0+11+13, a[1]=> 20+21+23
    }


}
