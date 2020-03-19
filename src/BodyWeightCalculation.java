import java.util.Scanner;

public class BodyWeightCalculation {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Nhap can nang : ");
        double weight = inputNumber.nextDouble();

        System.out.print("Nhap chieu cao : ");
        double height = inputNumber.nextDouble();

        double bmi = weight/Math.pow(height,2);
        System.out.println(bmi);
        if (bmi< 18.5){
            System.out.printf("bmi = %-5.2f, Underweight",bmi);
        } else if (bmi < 25){
            System.out.printf("bmi = %-5.2f, Normal",bmi);
        } else if (bmi< 30){
            System.out.printf("bmi = %-5.2f, Overweight",bmi);
        } else {
            System.out.printf("bmi = %-5.2f, Obese",bmi);
        }
    }
}