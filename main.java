import java.util.Scanner;

public class ShoppingList {
public static void printShoppingList(String str1, String str2, String str3){
      
      System.out.println("Shopping list:");
      System.out.println("1: " +str1);
      System.out.println("2: " +str2);
      System.out.println("3: " +str3);
      }
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String item1;
		String item2;
		String item3;

		item1 = scnr.next();
		item2 = scnr.next();
		item3 = scnr.next();

		printShoppingList(item1, item2, item3);
	}
}
