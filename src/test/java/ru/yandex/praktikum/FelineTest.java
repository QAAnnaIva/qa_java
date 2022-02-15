package ru.yandex.praktikum;


import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Test
    public void shouldGetKittensCount()  {

        Feline feline = new Feline();
        int actual = feline.getKittens(5);
        int expected = 5;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldGetKittens()  {

        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldGetFamily()  {

        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);

    }

    @Test
    public void shouldEatMeat() throws Exception {

        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = feline.getFood("Хищник");
        assertEquals(expected, actual);

    }

    @Test
    public void shouldBeUnknownKind()  {

        Exception exception = null;
        try {
            Feline feline = new Feline();
            feline.getFood("");
        } catch (Exception ex) {
            exception = ex;
        }

        assertNotNull(exception);
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",exception.getMessage());

    }




}
