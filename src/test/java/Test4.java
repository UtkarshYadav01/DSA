public class Test4 {
    public static void main(String[] args) {
        try {
            System.out.println(20/10);
        } catch (Exception e) {
            throw new NumberFormatException();
        }finally {
            System.out.println("print");
        }
    }
}
