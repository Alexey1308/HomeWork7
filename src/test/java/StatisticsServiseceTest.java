import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.StatisticsService;

public class StatisticsServiseceTest {

    @Test

    void findMaxInTheMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomeInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 111, 12};
        long expected = 111;
        long actual = service.findMax(incomeInBillions);
        Assertions.assertEquals(expected, actual);

    }
}
