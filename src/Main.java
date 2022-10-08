public class Main {
    public static void main(String[] args) {
        MagicBox magicBox1 = new MagicBox<String>(3);
        MagicBox magicBox2 = new MagicBox<Integer>(3);

        try {
            System.out.println(magicBox1.pick());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
