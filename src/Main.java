public class Main {
    //  int nemStatikusAdattag;
    //  static int statikusTag;

    public static void main(String[] args) {
       /*
        Main obj = new Main();
        System.out.println(obj.nemStatikusAdattag);
        System.out.println(Main.statikusTag);
       */
        for (int i = 0; i < 100; i++) {
            System.out.println(Veletlen.velEgesz(5, 10));
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.println(Veletlen.velKarakter((char) 65, (char) 90));
            // System.out.println(Veletlen.velKarakter('A', 'Z')); ez is jó lesz
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velTeljesNev(true));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velTeljesNev(false));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velDatum(2000,2022));

        }
    }

}