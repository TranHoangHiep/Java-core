import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int searchInt;
        int position;
        BinaryArray searchArray = new BinaryArray( 16 );
        System.out.println( searchArray );
        System.out.println("Please enter an integer value (-1 to quit): ");
        searchInt = input.nextInt();
        System.out.println();

        while( searchInt != -1){
            position = searchArray.binarySearch( searchInt );
            if ( position == -1 )
                System.out.println("The integer " + searchInt + " was not found.\n");
            else
                System.out.println("The integer " + searchInt + " was found in position " + position + ".\n");
            System.out.println("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
            System.out.println();
        }
    }
}
