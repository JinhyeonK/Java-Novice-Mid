public class MedianFinder {
    public static double medianByMerge(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int total = n + m;
        int midIndex = total / 2;

        int i = 0, j = 0;
        int m1 = 0, m2 = 0;

        for (int cnt = 0; cnt <= midIndex; cnt++) {
            m2 = m1;
            if (i < n && (j >= m || a[i] <= b[j])) {
                m1 = a[i++];
            } else {
                m1 = b[j++];
            }
        }

        if (total % 2 == 0) {
            return (m1 + m2) / 2.0;
        } else {
            return m1;
        }
    }

    public static void main(String[] args) {
        int[] a = {-5, 3, 6, 12, 15};
        int[] b = {-12, -10, -6, -3, 4, 10};
        System.out.println(medianByMerge(a, b));  // 3.0
    }
}

