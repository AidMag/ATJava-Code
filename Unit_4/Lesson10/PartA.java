/*
 * Aidan
 * ERROR Type: Run Time Error - this program will let you compile it but when it runs it cannot print a charater that is in a index that does not exist.
 */


public class PartA {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println("The last letter of the name is " + name.charAt(4)); //I changed name.charAt(name.length())
                                                                                //to 4 so that the program prints the last letter of Harry.   
        }

}
