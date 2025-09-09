import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap canh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a){
            double chuvi = a + b + c;
            double nuachuvi = chuvi / 2;
            double dientich = Math.sqrt(nuachuvi * (nuachuvi - a) * (nuachuvi - b) * (nuachuvi - c));

            System.out.println("Chu vi la: " + chuvi);
            System.out.println("Dien tich la: " + dientich);
        }
        else{
            System.out.println("khong tao thanh tam giam");
        }
    }
}
