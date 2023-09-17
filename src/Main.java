public class Main {
    public static void main(String[] args) {
    int intialBal = 5000;
    double interestRate = .17;
    double monthOne = 0;
    double monthTwo = 0;
     monthOne = (int) (intialBal * interestRate);


        System.out.println(" Your monthly intrest rate due for month one is " + monthOne + " you owe the original  5000 aswell ");

     monthTwo =  (int) (5850 * interestRate);
        System.out.println(" Your monthly intrest rate due for month two is " + monthTwo + "  you owe the original 5000 aswell ");
    }
}