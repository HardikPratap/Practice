/*   Created by IntelliJ IDEA.
 *   Author: Hardik Pratap
 *   Date: 21-10-2020
 *   Time: 08:04 PM
 *   File: DoWhile.java
 */

package BookPractice;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        String ch;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Press a key followed by enter");
            ch = scanner.nextLine();
        } while (!ch.equals("q"));
    }
}

