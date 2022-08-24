package PriceCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceIs0Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, 0)
        );

        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldReturn100ForBikeAndDistanceIs10Km() {
        int price = priceCalculator.calculatePrice(TransportType.BIKE, 10);
        Assertions.assertEquals(100, price);
    }

    @Test
    public void shouldThrowExceptionWhenBikeDistanceIsMoreThan20km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, 21)
        );

        Assertions.assertEquals("Bike can not go for more than 20 km", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenCarAndDistanceIs0Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, 0)
        );

        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldReturn700ForCarAndDistanceIs100Km() {
        int price = priceCalculator.calculatePrice(TransportType.CAR, 100);
        Assertions.assertEquals(700, price);
    }

    @Test
    public void shouldThrowExceptionWhenCarDistanceIsMoreThan1000km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, 1001)
        );

        Assertions.assertEquals("Car can not go for more than 1000 km", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenTruckAndDistanceIs0Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.TRUCK, 0)
        );

        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }


    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000Km() {
        int price = priceCalculator.calculatePrice(TransportType.TRUCK, 1000);
        Assertions.assertEquals(5000, price);
    }

    @Test
    public void shouldNotBeDrone() {
        UnsupportedOperationException ex = Assertions.assertThrows(
                UnsupportedOperationException.class,
                generateExecutable(TransportType.DRONE, 1000)
        );

        Assertions.assertEquals("transport type '" + TransportType.DRONE + "' is not handled correctly", ex.getMessage());
    }

    private Executable generateExecutable(TransportType type, int distance) {
        return () -> priceCalculator.calculatePrice(type, distance);
    }
}
