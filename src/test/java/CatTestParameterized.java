import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized;

    public class CatTestParameterized {

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {"Мясные продукты"},
                    {"Рыба"},
                    {"Другие продукты"}
            });
        }
    }


