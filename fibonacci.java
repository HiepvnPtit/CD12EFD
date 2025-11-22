// import java.util.Scanner;

// public class fibonacci{
//   //fibonacci thu n
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         for(short k=0; k<n; k++){
//           int a= sc.nextInt();
//           long x=1; long y=1; long z;

//           if(a<3){
//               System.out.println(1);
//           }

//           else{
//             for(int i=3; i<=a;i++){
//               z= x+y;
//               x=y; y=z;
//               if(a==i){
//                 System.out.println(z);
//               }                               
//             }
//           }     
//         }

//         sc.close();

//     }
// }


// import java.util.Scanner;

// public class btap{
//   //btap check xem co phai fibo ko
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t= sc.nextInt();
//         for (byte i=0; i<t; i++ ){
//           long n= sc.nextLong();
//           if(n<=3){
//             System.out.println("YES");
//           }

//           else if(n==4){
//             System.out.println("NO");
//           }

//           else{
//             long a=2; long b=3; long c=5;
//             while(c<n){
//               c=a+b;
//               a=b;b=c;
//             }

//             if(n==c){
//                 System.out.println("YES");
//             }

//             else{
//               System.out.println("NO");
//             }
            
//           }
//         }

//         sc.close();

//     }
// }
