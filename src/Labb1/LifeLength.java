package Labb1;

public class LifeLength {

    public static int f1(int a0) { // Uppgift 1
        int a1 = 0;
        if (a0 == 1) {
            a1 = 1;
        } else if (a0 % 2 == 0) {
            a0 = a0 / 2;
            a1 = a0;
        } else {
            a0 = 3 * a0 + 1;
            a1 = a0;
        }
        return a1;
    }
    public static int f2(int a0) { // Uppgift 2
        int a2 = f1(f1(a0));
        return a2;
    }
    public static int f4(int a0) {
        int a4 = f2(f2(a0));
        return a4;
    }
    public static int f8(int a0) {
        int a8 = f4(f4(a0));
        return a8;
    }
    public static int f16(int a0) {
        int a16 = f8(f8(a0));
        return a16;
    }
    public static int f32(int a0) {
        int a32 = f16(f16(a0));
        return a32;
    }
    public static int iterateF(int a0, int n) { // Uppgift 3
        int an = 0;
        for (int i = 0; i < n; i++) {
            a0 = f1(a0);
            an = a0;
        }
        return an;
    }

    // Uppgift 4
    public static int iterLifeLength(int a0) {
        int iterCount = 0;
        while (a0 != 1) {
            a0 = f1(a0);
            iterCount++;
        }
        return iterCount;
    }

    public static String intsToStrings(int x) {
        int startNumber = x;
        int lifeLengthX = 0;
        lifeLengthX = iterLifeLength(x);
        return "(Iter)The life length of " + startNumber + " is " + lifeLengthX + ".";
    }

    // Uppgift 6 f(x)={1, k=0. recF(F1(x))+1

    static int recLifeLength(int x) {
        if (x == 1) {
            return 0;
        } else {
            return recLifeLength(f1(x)) + 1;
        }
    }

    static String intsToStringsRecursive(int xRec) {
        int startNumber = xRec;
        int lifeLengthxRec = 0;
        lifeLengthxRec = recLifeLength(xRec);
        return "         (rec)The life length of " + startNumber + " is " + lifeLengthxRec + ".";
    }

    static void uppgift1(int a0) {
        System.out.println(f1(a0));
    }

    static void uppgift2(int a0) {
        System.out.print("f1=" + f1(a0) + " ");
        System.out.print("f2=" + f2(a0) + " ");
        System.out.print("f4=" + f4(a0) + " ");
        System.out.print("f8=" + f8(a0) + " ");
        System.out.print("f16=" + f16(a0) + " ");
        System.out.print("f32=" + f32(a0) + " ");
    }

    static void uppgift3() {
        System.out.println(iterateF(3, 5));
        System.out.println(iterateF(42, 3));
        System.out.println(iterateF(1, 3));
    }

    static void uppgift4Och6() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(intsToStrings(i) + intsToStringsRecursive(i));
        }
    }
        public static void main(String[]args){
            // [0]: 42 [1]:3 [2]:5 [3]:1
            int first = Integer.parseInt(args[0]);
            int n = 6;
            switch (n) {
                case 1:
                    uppgift1(first);
                    break;
                case 2:
                    uppgift2(first);
                    break;
                case 3:
                    uppgift3();
                    break;
                case 4:
                    uppgift4Och6();
                    break;
                case 6:
                    uppgift4Och6();
                    break;
                default:
                    System.out.println("Number need to be 1,2,3,4 or 6.");
            }
        }
}
