public class Dragon02 {
    private int x; //mendatar
    private int y; //atas bawah
    private int direction;

    public Dragon02() {
        this.x = 0; 
        this.y = 0;
        this.direction = 1;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            this.direction = newDirection;
        } else {
            System.out.println("Arah tidak valid! Gunakan angka 1 (atas), 2 (kanan), 3 (bawah), atau 4 (kiri).");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y -= steps;
                break;
            case 4:
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        String arah;
        switch (direction) {
            case 1:
                arah = "Atas";
                break;
            case 2:
                arah = "Kanan";
                break;
            case 3:
                arah = "Bawah";
                break;
            case 4:
                arah = "Kiri";
                break;
            default:
                arah = "Tidak diketahui";
        }
        System.out.println("Posisi Dragon x: " + x + ", y: " + y + ", arah: " + arah);
    }
}