class Car extends Vehicle {
    private int fuel = 100;

    Car(String name, String color) {
        super(name, color); 
        this.velocity = 10;
    }

    @Override
    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("走行距離：" + this.distance + "km");
        System.out.println("現在地：" + this.x);
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    public void charge(int litre) {
        System.out.println(litre + "L給油します");
        this.fuel = Math.min(100, this.fuel + litre);
        System.out.println("ガソリン量：" + this.fuel + "L");
    }
}