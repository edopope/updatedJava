package leetcode;
import java.text.DecimalFormat;

public class TheValueOPi {
        public static void main(String[] args) {
            double pi_approx = 0;
            int sign = 1;
            DecimalFormat df = new DecimalFormat("#.#####");

            for (int i = 1; i <= 200000; i++) {
                pi_approx += sign * 4.0 / (2 * i - 1);
                sign = -sign;
                if (i % 10000 == 0) {
                    System.out.println("Terms: " + i + " Pi Approximation: " + df.format(pi_approx));
                }
            }

            System.out.println("Pi Approximation: " + df.format(pi_approx));
            System.out.println("Difference from Math.PI: " + df.format(Math.abs(Math.PI - pi_approx)));

            // Find the number of terms required to get a value starting with 3.14159
            int terms = 0;
            String pi_str = df.format(pi_approx);
            while (!pi_str.startsWith("3.14159")) {
                terms++;
                pi_approx += (-1) * sign * 4.0 / (2 * terms + 1);
                sign = -sign;
                pi_str = df.format(pi_approx);
            }
            System.out.println("Terms required: " + terms);
        }
    }


