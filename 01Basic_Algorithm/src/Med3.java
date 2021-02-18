public class Med3 {
    public static void main(String[] args) {
        System.out.println("Median.median(3,2,1) = " + Median.median(3, 2, 1)); // a＞b＞c
        System.out.println("Median.median(3,2,2) = " + Median.median(3, 2, 2)); // a＞b＝c
        System.out.println("Median.median(3,1,2) = " + Median.median(3, 1, 2)); // a＞c＞b
        System.out.println("Median.median(2,1,3) = " + Median.median(2, 1, 3)); // c＞a＞b
        System.out.println("Median.median(3,3,2) = " + Median.median(3, 3, 2)); // a＝b＞c
        System.out.println("Median.median(3,3,3) = " + Median.median(3, 3, 3)); // a＝b＝c
        System.out.println("Median.median(2,2,3) = " + Median.median(2, 2, 3)); // c＞a＝b
        System.out.println("Median.median(2,3,1) = " + Median.median(2, 3, 1)); // b＞a＞c
        System.out.println("Median.median(2,3,2) = " + Median.median(2, 3, 2)); //
        System.out.println("Median.median(3,2,3) = " + Median.median(3, 2, 3)); // a＝c＞b b＞a＝c
        System.out.println("Median.median(1,3,2) = " + Median.median(1, 3, 2)); // b＞c＞a
        System.out.println("Median.median(2,3,3) = " + Median.median(2, 3, 3)); // b＝c＞a
        System.out.println("Median.median(1,2,3) = " + Median.median(1, 2, 3)); // c＞b＞a
    }
}
