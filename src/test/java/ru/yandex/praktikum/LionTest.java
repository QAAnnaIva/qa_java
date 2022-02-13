package ru.yandex.praktikum;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)

public class LionTest {


    private final String sex ;
    private final boolean expected;

    public LionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getSex() {

        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {

            Lion lion = new Lion(sex);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);
            System.out.println("doesHaveMane? : "+actual);

    }



    @Test
    public void shouldBeUnknownSex()  {

 Exception exception = null;
        try {
            Lion lion = new Lion("");
           lion.doesHaveMane();
        } catch (Exception ex) {
            exception = ex;
        }

        assertNotNull(exception);
        assertEquals("Используйте допустимые значения пола животного - самец или самка",exception.getMessage());
        System.out.println(exception.getMessage());
    }







}
