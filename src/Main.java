public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] codes = {24, 36, 48, 51, 62}; // we are not declaring the size.
        double[] sales = new double[10]; // we are declaring the size

        sales[9] = 23.5;
        sales[8] = 100.25;

        //here are some examples of printing out the data in the elements
        System.out.println("Some codes: " + codes[0] + "  " + codes[1]);
        System.out.println("Some sales: " + sales[0] + "  "  + sales[9]);

        //challenge create an array named zip codes and populate it with 5 zip codes
        int [] zipCodes = {24141, 24084, 24301, 24324, 24347};

        //print out the data that is in zip codes position/element 3
        System.out.println("Zip code for position/element 3 is: " + zipCodes[3]);

        int counter;
        System.out.println("Forwards:");
        for(counter = 0; counter < codes.length; ++counter){
            System.out.print(codes[counter] + "   ");
        }
        System.out.println("\nBackwards:");
        for(counter = codes.length - 1; counter >=0; --counter){
            System.out.print(codes[counter] + "   ");
        }


        //demo how to use a for loop to populate and array.

        //create an array for Strings called apples

        String[] apples = new String[10];

        //use a for loop to look at the values as they are now.

        for(int appleCounter = 0; appleCounter < apples.length; ++appleCounter){
            System.out.print(apples[appleCounter] = "Apple #: " + appleCounter);
        }

//        for(int appleCounter = 0; appleCounter < apples.length; ++appleCounter){
//            System.out.print(apples[appleCounter] + "Apple Data: ");
//        }

    }//ends main method/driver
}//ends main class file