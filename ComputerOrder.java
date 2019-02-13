/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer.order;

/**
 *
 * @author David
 */
public class ComputerOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

private static final int INVENTORY_SIZE = 12;
private Stock [] stocks;

public StockInvetory() {
    stocks = new Stock [INVENTORY_SIZE];

}

private static void StockInventory() {
       for (int i = 0; i<INVENTORY_SIZE; i++){
         Scanner console = new Scanner(System.in);

    System.out.println ("Stock's name:");
    String stockName = console.next();

    System.out.println ("Stock's rating");
    String stockRating= console.next();

    System.out.println ("Stock's price:");
    int stockPrice = console.nextInt();
    }
    
}
