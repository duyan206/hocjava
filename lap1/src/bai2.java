import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double bk = sc.nextDouble();
        System.out.println("Chu vi:" + (2* Math.PI*bk));
        System.out.print("Dien tich:" + (bk* Math.PI*bk));
    }
}
