abstract class Vehicle {
    protected String name;
    protected String color;
    protected int distance = 0;

    protected int x = 0;
    protected int velocity = 0;

    Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() { return this.name; }

    public void go(int time) {
        this.x += (this.velocity * time);
        this.distance += Math.abs(this.velocity * time);
    }

    public void back(int time) {
        this.x -= (this.velocity * time);
        this.distance += Math.abs(this.velocity * time);
    }

    public static void diff(int x1, int x2) {
        int result = Math.abs(x1 - x2);
        System.out.println("二つの乗り物の現在地の差は" + result + "です");
    }

    public abstract void printData();
}