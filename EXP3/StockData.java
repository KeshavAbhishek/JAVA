// import java.util.Scanner;

// public class StockData {
//     public static void main(String[] args) {
//         // Define the number of stocks and time intervals
//         int numStocks = 3; // Change this to the desired number of stocks
//         int numIntervals = 4; // Change this to the desired number of intervals

//         // Create a 2D array to store the stock data (time and value)
//         double[][] stockData = new double[numStocks][numIntervals];

//         // Initialize Scanner for user input
//         Scanner scanner = new Scanner(System.in);

//         // Input stock data
//         for (int i = 0; i < numIntervals; i++) {
//             System.out.println("Enter data for interval " + (i + 1) + ":");
//             for (int j = 0; j < numStocks; j++) {
//                 System.out.print("Enter value for stock " + (j + 1) + ": ");
//                 stockData[j][i] = scanner.nextDouble();
//             }
//         }

//         // Print stock values at respective time intervals
//         for (int i = 0; i < numIntervals; i++) {
//             System.out.println("\nValues at interval " + (i + 1) + ":");
//             for (int j = 0; j < numStocks; j++) {
//                 System.out.println("Stock " + (j + 1) + ": " + stockData[j][i]);
//             }
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }


public class StockData {
    public static void main(String[] args) {
        // Create a 2D array to store the time and value of different stocks
        double[][] stockData = {
            {9.00, 100.20},
            {9.30, 102.50},
            {10.00, 98.60}
            // Add more data as needed
        };

        // Print the values at the respective timed intervals
        for (double[] data : stockData) {
            System.out.println("Time: " + data[0] + ", Value: " + data[1]);
        }
    }
}
