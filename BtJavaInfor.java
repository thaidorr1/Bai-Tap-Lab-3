
package bt.java.infor;
import java.util.Scanner ;

public class BtJavaInfor {
    public static void main(String[] args) {
       //giai phuong trinh bac 2 co dang a^2 +bx + c = 0 (a != 0 )
       Scanner sc =  new Scanner (System.in) ;
       System.out.print("Nhap vao he so a : ") ;
       float a = sc.nextFloat() ;
       System.out.print("Nhap vao he so b : ") ;
       float b = sc.nextFloat() ;
       System.out.print("Nhap vao he so c : ") ;
       float c = sc.nextFloat() ;
       // ta tính delta của phương trình delta = b^2 - 4ac bậc 2 thì ta dùng hàm pow của thư viện Math 
       float Delta = (float) (Math.pow(b, 2)) - 4*a*c ;
       System.out.println(Delta);
       // trường hợp delta > 0 thì ta có 2 nghiệm phân biệt
       if (Delta > 0 ) {
           float x1 , x2 ;
           x1 = (float) ((-b + (Math.sqrt(Delta))) / (2*a)) ; 
           x2 = (float) ((-b - (Math.sqrt(Delta))) / (2*a)) ; 
           System.out.println("Phương trình có 2 nghiệm x1: " + x1 + " và x2: " +x2);
       }
       // trường hợp delta == 0 thì ta có nghiệm kép 
       else if (Delta == 0 ) {
           float x =  (-b) / (2*a);
           System.out.println("Phương trình có nghiệm kép x :" + x);
       }
       // còn nếu trường hợp delta < 0 thì ta có pt vô nghiệm
       else {
           System.out.println("Phương trình vô nghiệm !");
       }
    }
}
