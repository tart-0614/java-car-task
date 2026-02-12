public abstract class Vehicle {
    protected String name;
    protected String color;
    protected int distance = 0; // 修正点：属性追加
    protected int x = 0;
    protected int velocity = 0;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 修正点：getName()を追加
    public String getName() {
        return this.name;
    }

    public void go(int time) {
        this.x += (this.velocity * time);
        this.distance += Math.abs(this.velocity * time);
    }

    public void back(int time) {
        this.x -= (this.velocity * time);
        this.distance += Math.abs(this.velocity * time);
    }

    // 修正点：引数とstaticの明示
    public static void diff(int x1, int x2) {
        int result = Math.abs(x1 - x2);
        System.out.println("二つの乗り物の現在地の差は" + result + "です");
    }

    // 修正点：抽象メソッドとして定義
    public abstract void printData();
}