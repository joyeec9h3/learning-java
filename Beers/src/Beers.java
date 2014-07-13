
public class Beers {
	public static void main(String[] args) {
		startSinging(99);
	}
	
	public static void sing(int bottle) {
		System.out.printf("\n%d bottles of beer on the wall, %d bottles of beer,", bottle, bottle);
		System.out.printf(" ya’ take one down, ya’ pass it around, %d ", bottle - 1);
		System.out.printf("bottle%s of beer on the wall.\n", bottle - 1 > 1 ? "s" : "");
	}
	
	public static void singTheEnd() {
		System.out.printf("\nNo bottles of beer on the wall, no bottles of beer, ");
		System.out.printf("ya’ can’t take one down, ya’ can’t pass it around, ");
		System.out.printf("’cause there are no more bottles of beer on the wall! \n");
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
