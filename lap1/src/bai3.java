import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        int a = sc.nextInt();
        System.out.println("Nhap chieu rong: ");
        int b = sc.nextInt();
        System.out.println("Chu vi hinh CN: " + (a+b)*2);
        System.out.println("Dien tich hinh CN: " + (a*b));
    }
}
