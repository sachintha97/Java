public class ScopeTest {
    private static int num1 =10;
    private int num =25;

    public static void main(String[] args) {
        int num1 = 45;
        int num = 35;
        System.out.println(num);// print 35

        System.out.println(ScopeTest.num1); //print 10

        ScopeTest obj = new ScopeTest();
        System.out.println(obj.num); // print 25




    }

}
