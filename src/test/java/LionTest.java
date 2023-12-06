import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline felineMock;

    @Test
    public void testGetKittens() throws Exception {

        when(felineMock.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", felineMock);

        int result = lion.getKittens();

        assertEquals(3, result);
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        when(felineMock.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самец", felineMock);

        List<String> result = lion.getFood();

        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), result);
    }
}
