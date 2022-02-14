package ru.yandex.praktikum;

import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;



@RunWith(MockitoJUnitRunner.class)

public class LionTestMock {


    @Mock
    Feline feline;

    @Test
    public void shouldHave1Kitten() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldEatMeat() throws Exception {
        Lion lion = new Lion("Самка",feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Рыба");
        assertEquals(expected, actual);
    }





}
