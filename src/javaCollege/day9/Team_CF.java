    package javaCollege.day9;

    import java.util.*;
    public class Team_CF {
        static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    int n = scanner.nextInt();
                    int solvedCount = 0;
                    while (n-- > 0){
                        int petya = scanner.nextInt();
                        int vasya = scanner.nextInt();
                        int tonya = scanner.nextInt();
                        if (petya + vasya + tonya >= 2) {
                            solvedCount++;
                        }
                    }
                    System.out.println(solvedCount);
                }
            }

