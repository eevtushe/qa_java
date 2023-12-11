import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

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
        lenient().when(animalMock.getFamily()).thenReturn("Кошачьи");
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void testGetSound() {
        lenient().when(animalMock.getFamily()).thenReturn("Кошачьи");
        assertEquals("Мур", feline.getSound());
    }

    @Test
    public void testEatMeat() throws Exception {

        lenient().when(animalMock.getFood("Хищник")).thenReturn(Arrays.asList("Мясо", "Рыба"));
        List<String> result = feline.eatMeat();
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), result);
    }
}
