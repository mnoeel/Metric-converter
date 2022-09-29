import java.util.Scanner;
public class Assignment2 {
    public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum) {
        float targetNum=0;
        switch(sourceMetric) {
            case "lb":
                switch (targetMetric){
                    case "oz":
                    targetNum=sourceNum*16;
                    System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                    break;
                    case "mg":
                    targetNum=sourceNum*453592;
                    System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                    break;
                    default: 
                    System.out.println("Your input is not valid. Please try again.");
                }
            break; 
            case "g":
                switch(targetMetric) {
                    case "kg":
                    targetNum=sourceNum*(float)0.001;
                    System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                    break;
                    case "mg":
                    targetNum=sourceNum*1000;
                    System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                    break;
                    default: 
                    System.out.println("Your input is not valid. Please try again.");
                }
            break;
            case "ft":
            switch(targetMetric) {
                case "in":
                targetNum=sourceNum*12;
                System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                break;
                case "yard":
                targetNum=sourceNum/3;
                System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                break;
                default: 
                System.out.println("Your input is not valid. Please try again.");
            }
            break;
            case "cm":
            switch(targetMetric) {
                case "mm":
                targetNum=sourceNum*10;
                System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                break;
                case "m":
                targetNum=sourceNum*(float).01;
                System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
                break;
                default: 
                System.out.println("Your input is not valid. Please try again.");
            }
            break;
            default: 
            System.out.println("Your input is not valid. Please try again.");
        }  
        return targetNum; 
    }    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sourceNum;
        String sourceMetric;
        String targetMetric;
        String str;
        String[] strArray;

        while(true) {
            System.out.println("Please input your query. For example, 1 km = m.");
            System.out.println("Enter 'exit' to exit the program");
            str = scanner.nextLine();
            strArray=str.split(" ");
            
            if (str.equals("exit")) {
                System.out.println("Thank you. Goodbye!");
                scanner.close();
                return;
            }
            else if (strArray.length!=4) {
                System.out.println("Your input is not valid. Please try again.");
                continue;
            }        
            else {
            sourceNum = Float.parseFloat(strArray[0]);
            sourceMetric = strArray[1];
            targetMetric = strArray[3];
            metricConverter(sourceMetric,targetMetric,sourceNum);
            }
        }

    }
}