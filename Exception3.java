public class Exception3 {
    public static void main(String[] args) {
        try {
            int bil = 10;
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error");
        } catch (Exception1 e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
