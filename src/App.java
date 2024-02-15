import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //ex1
        /*
        int numar = 1;

        while (numar != 0) {
            numar = sc.nextInt();

            if (numar > 0) {
                System.out.println("numarul introdus este pozitiv.");
            } else if (numar < 0) {
                System.out.println("numarul introdus este negativ.");
            }
        }
*/
//ex2
/*
int[] v = {5, 10, 15, 20, 25};

int sum = 0;
for (int i = 0; i < v.length; i++) {
    sum += v[i];
}


double medie = (double) sum / v.length;

// Print the average
System.out.println("media elementelor este: " + medie);
*/
//ex4
/*
Encapsulare e = new Encapsulare();
e.setMembru1(1);
e.setMembru2(2);
e.getmembru1();
e.getmembru2()
*/
        sc.close();
    }
}
