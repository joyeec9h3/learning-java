
public class Beers {
	public static void main(String[] args) {
		startSinging(99);
	}
	
	public static void sing(int bottle) {
		System.out.printf("\n%d bottles of beer on the wall, %d bottles of beer,", bottle, bottle);
		System.out.printf("ya¡¯ take one down, ya¡¯ pass it around, %d bottles of beer on the wall.\n", bottle - 1);
	}
	
	public static void singTheEnd() {
		System.out.print("\nNo bottles of beer on the wall, no bottles of beer, ");
		System.out.print("ya¡¯ can¡¯t take one down, ya¡¯ can¡¯t pass it around, ");
		System.out.print("¡¯cause there are no more bottles of beer on the wall!\n");
	}
	
	public static void startSinging(int bottle) {
		if (bottle > 1) {
			sing(bottle);
			startSinging(bottle - 1);
		} else {
			singTheEnd();
		}
	}
}
