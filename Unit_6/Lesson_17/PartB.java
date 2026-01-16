
/*
Aidan
*/

public class PartB {
    
    public static void printArrays(int[][] arrays){
        for (int r = 0; r < arrays.length; r++){
            for (int c = 0; c < arrays[r].length; c++) {
                System.out.print(arrays[r][c] + ", ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        int[][] values = { { 8, 6, 7 }, { 5, 3, 0 } };
        int[][] nu_values = { { 0, 7, 6, 5 }, { 2, 2, 0, 1 }, { 8, 4, 5, 7 } };
        
        System.out.println("First array: ");
        printArrays(values);
        
        System.out.println("--------------------");
        
        System.out.println("Second array: ");
        printArrays(nu_values);
    }
}
