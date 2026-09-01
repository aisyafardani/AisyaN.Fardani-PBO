public class DragonMain02 {
    public static void main(String[] args) {
        Dragon02 dragon1 = new Dragon02();
        Dragon02 dragon2 = new Dragon02();

        System.out.println("=== Status Awal ===");
        dragon1.printStatus();
        dragon2.printStatus();

        dragon1.changeDirection(2);
        dragon1.move(10);

        dragon2.changeDirection(3);
        dragon2.move(3);

        System.out.println("\n=== Status Setelah Bergerak ===");
        dragon1.printStatus();
        dragon2.printStatus();
    }
}