package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.repository.AfishaRepository;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AfishaManagerTestMock {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;

    Afisha first = new Afisha(1, 1, "Бладшот", "боевик");
    Afisha second = new Afisha(2, 2, "Вперед", "мультфильм");
    Afisha third = new Afisha(3, 3, "Отель Белград","комедия");
    Afisha fourth = new Afisha(4, 4, "Джентльмены","боевик");
    Afisha fifth = new Afisha(5, 5, "Человек-Невидимка","ужасы");
    Afisha sixth = new Afisha(6, 6, "Тролли. Мировой тур","мультфильм");
    Afisha seventh = new Afisha(7, 7, "Номер один","комедия");
    Afisha eighth = new Afisha(8, 8, "Берегись авто","комедия");
    Afisha nineth = new Afisha(9, 9, "Гадкий я","мультфильм");
    Afisha tenth = new Afisha(10, 10, "Перестрелка","боевик");

    @Test
    public void shouldAddMovie() {
        Afisha[] returned = new Afisha[]{fifth};
        doReturn(returned).when(repository).findAll();

        manager.add(fifth);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{fifth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastTenAdded() {
        Afisha[] returned = new Afisha[]{tenth, nineth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        doReturn(returned).when(repository).findAll();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(nineth);
        manager.add(tenth);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{tenth, nineth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAddedIfOneMovie() {
        Afisha[] returned = new Afisha[]{second};
        doReturn(returned).when(repository).findAll();

        manager.add(second);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{second};
        assertArrayEquals(expected, actual);
    }

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void shouldShowLastAdded() {
        Afisha[] returned = new Afisha[]{sixth, fifth, fourth, third, second, first};
        doReturn(returned).when(repository).findAll();

        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded2() {
        Afisha[] returned = new Afisha[]{seventh, fourth, sixth, fifth, third, second, first};
        doReturn(returned).when(repository).findAll();

        manager.add(fifth);
        manager.add(sixth);
        manager.add(fourth);
        manager.add(seventh);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{seventh, fourth, sixth, fifth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded3() {
        Afisha[] returned = new Afisha[]{fourth, seventh, sixth, fifth, tenth, third, second, first};
        doReturn(returned).when(repository).findAll();

        manager.add(tenth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(fourth);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{fourth, seventh, sixth, fifth, tenth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}
