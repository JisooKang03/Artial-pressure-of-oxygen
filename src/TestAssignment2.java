/**

 * Name: Ji-Soo Kang
 * Campus: Trafalgar Campus
 * Assignment 2
 * Date: June 06, 2022
 * Student# 991636291
 */
import java.util.Scanner;
public class TestAssignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double oxy;
        double Temp;
        String Health;



        Oxygen oxy1 = new Oxygen();
        Oxygen oxy2 = new Oxygen();

        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature();

        //PartPressOX1
        System.out.println("Enter the reading for the partial pressure of oxygen for the first device: ");
        oxy1.setPartPressOx(input.nextDouble());

        //product name 1
        System.out.println("Enter the product name of the first oxygen Saturation device: ");
        oxy1.setProductName(input.next());

        //accuracy 1
        System.out.println("Enter the accuracy of the first oxygen Saturation Device: ");
        oxy1.setAccuracy(input.next());

        //bioData 1
        System.out.println("Enter the type of biometric data: ");
        oxy1.setBioData(input.next());

        //parepressox 2
        System.out.println("Enter the reading for the partial pressure of oxygen for the second device: ");
        oxy2.setPartPressOx(input.nextDouble());

        //Productname 2
        System.out.println("Enter the product name of the second oxygen saturation device: ");
        oxy2.setProductName(input.next());

        //Accuracy 2
        System.out.println("Enter the accuracy of the second oxygen saturation device: ");
        oxy2.setAccuracy(input.next());

        System.out.println("Enter the type of the biometric Data: ");
        oxy2.setBioData(input.next());

        System.out.println("\n");

        if(oxy1.computeOutput() == oxy2.computeOutput()) {
            System.out.println("The two reading are equal ");
        }else{
                System.out.println("The two readings are inequal");
        }

        System.out.println(" \n ");
        System.out.println("Product name: " + oxy1.getProductName());
        System.out.println("Accuracy : " + oxy1.getAccuracy());
        System.out.println("Biometric Data: " + oxy1.getBioData());
        System.out.printf("SpO2 : %.1f\n"  , oxy1.computeOutput());

        System.out.println(" \n ");
        System.out.println("Product name: " + oxy2.getProductName());
        System.out.println("Accuracy : " + oxy2.getAccuracy());
        System.out.println("Biometric Data: " + oxy2.getBioData());
        System.out.printf("SpO2 : %.1f\n"  , oxy2.computeOutput());

        System.out.println("Enter the temperature reading in Fahrenheit for the first device: ");
        temp1.setTemperValue(input.nextDouble());

        System.out.println("Enter the  product name of the first temperature device: ");
        temp1.setProductName(input.next());

        System.out.println("Enter the accuracy of the first temperature device: ");
        temp1.setAccuracy(input.next());

        System.out.println("Enter the type of the biometric data: ");
        temp1.setBioData(input.next());

        System.out.println("Enter the temperature reading in Fahrenheit for the second device: ");
        temp2.setTemperValue(input.nextDouble());

        System.out.println("Enter the product name of the second temperature device: ");
        temp2.setProductName(input.next());

        System.out.println("Enter the accuracy of the second temperature device: ");
        temp2.setAccuracy(input.next());

        System.out.println("Enter the type of the biometric data: ");
        temp2.setBioData(input.next());

        if(temp1.computeOutput() == temp2.computeOutput()) {
            System.out.println("The two reading are equal ");
        }else{
            System.out.println("The two readings are inequal");
        }

        System.out.println(" \n ");
        System.out.println("Product name: " + temp1.getProductName());
        System.out.println("Accuracy : " + temp1.getAccuracy());
        System.out.println("Biometric Data: " + temp1.getBioData());
        System.out.printf("Temperature in Celsius : %.1 f\n"  , temp1.computeOutput());

        System.out.println(" \n ");
        System.out.println("Product name: " + temp2.getProductName());
        System.out.println("Accuracy : " + temp2.getAccuracy());
        System.out.println("Biometric Data: " + temp2.getBioData());
        System.out.printf("Temperature in Celsius : %.1f\n"  , temp2.computeOutput());
    }

}
