import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {
    private Car car;
    private Bicycle bicycle;

    @BeforeEach
    void setUp() {
        car = new Car("フェラーリ", "赤");
        bicycle = new Bicycle("ビアンキ", "緑");
    }

    @Test
    void testGo() {
        car.go(3);
        assertEquals(30, car.x, "goメソッドで現在地xが正しく計算されていません");
    }

    @Test
    void testBack() {
        bicycle.back(4);
        assertEquals(-20, bicycle.x, "backメソッドで現在地xが正しく計算されていません");
    }

    @Test
    void testDistance() {
        car.go(1);   // x=10, dist=10
        car.back(1);  // x=0,  dist=20
        assertEquals(20, car.distance, "走行距離distanceの加算が正しくありません");
    }

    @Test
    void testDiff() {
        car.x = 50;
        bicycle.x = 10;
        int difference = Math.abs(car.x - bicycle.x);
        assertEquals(40, difference);
    }
}