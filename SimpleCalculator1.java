public class SimpleCalculator1{
    public static void main(String[] args){
        int choice = 1; 
        double num1 = 10.5; 
        double num2 = 2.5;

        switch (choice) {
            case 1:
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else
                    System.out.println("Error! Division by zero.");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
