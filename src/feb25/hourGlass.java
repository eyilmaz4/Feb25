package feb25;

public class hourGlass {
    public static void main(String[] args) {
        hGlass();
    }

    public static void hGlass() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            for (int k = i; k < 11; k++) {
                System.out.print(" ");
            }
        }
    }
}