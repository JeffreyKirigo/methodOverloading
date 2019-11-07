public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(7,5));
        calcFeetAndInchesToCentimeters(100);
    }
    public static double calcFeetAndInchesToCentimeters(double feet,double Inches){
         if((feet <0) || ((Inches < 0) || (Inches > 12))){
             System.out.println("Invalid feet and centimeters");
             return -1;
        }
        double centimeters = (feet * 12)* 2.54;
         centimeters += (int) Inches *2.54;
        System.out.println(feet + "feet, "+ Inches + "inches= " + centimeters + " cm");
        return centimeters;

    }
    public static double calcFeetAndInchesToCentimeters(double Inches){
        if (Inches <0){
            return -1;
        }
        double feet = (int) Inches /12;
        double remainingInches = (int) Inches%12;
        System.out.println(Inches + " inches is equal to " + feet+" feet and "+ remainingInches+" inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
