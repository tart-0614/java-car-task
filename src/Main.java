import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Car car = new Car("フェラーリ", "赤");
        Bicycle bicycle = new Bicycle("ビアンキ", "緑");

        System.out.println("【車の移動】");
        System.out.print("前進する時間を入力してください：");
        int carTimeGo = scanner.nextInt();
        car.go(carTimeGo);
        
        // 修正点：backメソッドを利用
        System.out.print("後退する時間を入力してください：");
        int carTimeBack = scanner.nextInt();
        car.back(carTimeBack);
        
        car.printData();

        System.out.println("\n【自転車の移動】");
        System.out.print("前進する時間を入力してください：");
        int biTimeGo = scanner.nextInt();
        bicycle.go(biTimeGo);
        bicycle.printData();

        System.out.println("\n-----------------");
        Vehicle.diff(car.x, bicycle.x);
        
        scanner.close();
    }
}