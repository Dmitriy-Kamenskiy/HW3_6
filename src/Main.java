public class Main {
    public static void main(String[] args) {
        MagicBox magicBox1 = new MagicBox<String>(2);
        MagicBox magicBox2 = new MagicBox<Integer>(3);

        magicBox1.add("Вася");
        magicBox1.add("Петя");
        magicBox2.add(1);
        magicBox2.add(2);
        try {
            System.out.println(magicBox1.pick());
            System.out.println(magicBox2.pick());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        magicBox2.add(3);
        try {
            System.out.println(magicBox1.pick());
            System.out.println(magicBox2.pick());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
