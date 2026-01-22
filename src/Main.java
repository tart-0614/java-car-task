public class Main {
    public static void main(String[] args) {
        Car car = new Car("フェラーリ", "赤");
        Bicycle bicycle = new Bicycle("ビアンキ", "緑");

        System.out.println("--- 車の移動 ---");
        car.go(3);
        car.printData();

        System.out.println("--- 自転車の移動 ---");
        bicycle.go(2);
        bicycle.printData();

        System.out.println("-----------------");
        Vehicle.diff(car.x, bicycle.x);
    }
}