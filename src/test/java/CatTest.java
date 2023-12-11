import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class CatTest {

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private Feline felineMock;

    @InjectMocks
    private Cat cat;

    @Parameterized.Parameter
    public String food;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return CatTestParameterized.data();
    }

    @Test
    public void testGetFood() throws Exception {
        when(felineMock.eatMeat()).thenReturn(List.of(food));

        List<String> result = cat.getFood();

        assertEquals(List.of(food), result);
    }

    @Test
    public void testGetSound() {
        when(felineMock.getSound()).thenReturn("Мяу");
        assertEquals("Мяу", cat.getSound());
    }
}
