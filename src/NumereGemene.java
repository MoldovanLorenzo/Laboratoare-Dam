public class NumereGemene {
    public static boolean ePrim(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void gasestePerechea() {
        System.out.println("perechea de numere sub 100 este: ");
        for (int i = 2; i < 100 - 2; i++) {
            if (ePrim(i) && ePrim(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
