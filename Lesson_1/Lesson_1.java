public class Lesson_1 {

        public static void main(String[] args) {
            printThreeWords();
            checkSumSang();
            printColor();
            compareNumbers();
        }
        //  Задача 1
        static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");

        }
        //  Задача 2
        static void checkSumSang() {
            int a = 10;
            int b = 15;
            int c = a + b;
            if (c >= 0) {
                System.out.println("The sum is a positive");
            } else {
                System.out.println("The sum is a negative");
            }
        }

        // Задача 3
        static void printColor() {
            int value= -10;
            if (value<= 0){
                System.out.println("Red");
            }else if (value<100 && value>0){
                System.out.println("Yellow");
            }else {
                System.out.println("Green");
            }
        }

        // Задача 4
        static void compareNumbers() {
            int a= 11;
            int b= 17;
            if(a>=b){
                System.out.println("a>=b");
            }else {
                System.out.println("a<b");
            }
        }
    }
