class Bicycle extends Vehicle {
    Bicycle(String name, String color) {
        super(name, color);
        this.velocity = 5;
    }

    @Override
    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("走行距離：" + this.distance + "km");
        System.out.println("現在地：" + this.x);
    }
}