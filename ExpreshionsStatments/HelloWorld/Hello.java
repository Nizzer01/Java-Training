package ExpreshionsStatments.HelloWorld;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Bob");
        System.out.println("Hello World");

        //Example if statement
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Is Not an Alien");
        }


        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        //Logical AND example
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        //Logical OR
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }


        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        //Ternary operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic t our country");
        }

        String s = (isDomestic) ? "this car is domestic" : "This car is not domestic";
        System.out.println(s);


        System.out.println("");
        System.out.println("*********************");
        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myOutput = 0.0;

        myOutput = (myDouble + mySecondDouble) * 100.00d;
        System.out.println("My output: " + myOutput);

        double myRemainder = myOutput % 40.00d;
        System.out.println("My remainder: " + myRemainder);

        boolean myBool =  (myRemainder == 0) ? true : false;
        System.out.println("myBool: " + myBool);

        if (!myBool ) {
            System.out.println("Got some remainder");
        }




    }
}
