import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.lenient;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    private Animal animalMock;

    @InjectMocks
    private Feline feline;

    @Test
    public void testGetFamily() {
        // Мокируем вызов getFamily
        lenient().when(animalMock.getFamily()).thenReturn("Кошачьи");

        // Вызываем метод getFamily и проверяем, что результат равен ожидаемому значению
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        // Вызываем метод getKittens и проверяем, что результат равен ожидаемому значению
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount() {
        // Вызываем метод getKittens с параметром и проверяем, что результат равен ожидаемому значению
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void testGetSound() {
        // Мокируем вызов getFamily
        lenient().when(animalMock.getFamily()).thenReturn("Кошачьи");

        // Вызываем метод getSound и проверяем, что результат равен ожидаемому значению
        assertEquals("Мур", feline.getSound());
    }
}
