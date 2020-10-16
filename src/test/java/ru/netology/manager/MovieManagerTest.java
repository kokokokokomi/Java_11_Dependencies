package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();

        MovieItem first = new MovieItem(1, 1, "Бладшот", "боевик");
        MovieItem second = new MovieItem(2, 2, "Вперед", "мультфильм");
        MovieItem third = new MovieItem(3, 3, "Отель Белград","комедия");
        MovieItem fourth = new MovieItem(4, 4, "Джентльмены","боевик");
        MovieItem fifth = new MovieItem(5, 5, "Человек-Невидимка","ужасы");
        MovieItem sixth = new MovieItem(6, 6, "Тролли. Мировой тур","мультфильм");
        MovieItem seventh = new MovieItem(7, 7, "Номер один","комедия");
        MovieItem eighth = new MovieItem(8, 8, "Берегись авто","комедия");
        MovieItem nineth = new MovieItem(9, 9, "Гадкий я","мультфильм");
        MovieItem tenth = new MovieItem(10, 10, "Перестрелка","боевик");
        manager.add(fifth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fifth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, 1, "Бладшот", "боевик");
        MovieItem second = new MovieItem(2, 2, "Вперед", "мультфильм");
        MovieItem third = new MovieItem(3, 3, "Отель Белград","комедия");
        MovieItem fourth = new MovieItem(4, 4, "Джентльмены","боевик");
        MovieItem fifth = new MovieItem(5, 5, "Человек-Невидимка","ужасы");
        MovieItem sixth = new MovieItem(6, 6, "Тролли. Мировой тур","мультфильм");
        MovieItem seventh = new MovieItem(7, 7, "Номер один","комедия");
        MovieItem eighth = new MovieItem(8, 8, "Берегись авто","комедия");
        MovieItem nineth = new MovieItem(9, 9, "Гадкий я","мультфильм");
        MovieItem tenth = new MovieItem(10, 10, "Перестрелка","боевик");
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

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, nineth, eighth, seventh, sixth, fifth, fourth, third, second, first};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded2() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, 1, "Бладшот", "боевик");
        MovieItem second = new MovieItem(2, 2, "Вперед", "мультфильм");
        MovieItem third = new MovieItem(3, 3, "Отель Белград","комедия");
        MovieItem fourth = new MovieItem(4, 4, "Джентльмены","боевик");
        MovieItem fifth = new MovieItem(5, 5, "Человек-Невидимка","ужасы");
        MovieItem sixth = new MovieItem(6, 6, "Тролли. Мировой тур","мультфильм");
        MovieItem seventh = new MovieItem(7, 7, "Номер один","комедия");
        MovieItem eighth = new MovieItem(8, 8, "Берегись авто","комедия");
        MovieItem nineth = new MovieItem(9, 9, "Гадкий я","мультфильм");
        MovieItem tenth = new MovieItem(10, 10, "Перестрелка","боевик");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded3() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, 1, "Бладшот", "боевик");
        MovieItem second = new MovieItem(2, 2, "Вперед", "мультфильм");
        MovieItem third = new MovieItem(3, 3, "Отель Белград","комедия");
        MovieItem fourth = new MovieItem(4, 4, "Джентльмены","боевик");
        MovieItem fifth = new MovieItem(5, 5, "Человек-Невидимка","ужасы");
        MovieItem sixth = new MovieItem(6, 6, "Тролли. Мировой тур","мультфильм");
        MovieItem seventh = new MovieItem(7, 7, "Номер один","комедия");
        MovieItem eighth = new MovieItem(8, 8, "Берегись авто","комедия");
        MovieItem nineth = new MovieItem(9, 9, "Гадкий я","мультфильм");
        MovieItem tenth = new MovieItem(10, 10, "Перестрелка","боевик");
        manager.add(first);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{first};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded4() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, 1, "Бладшот", "боевик");
        MovieItem second = new MovieItem(2, 2, "Вперед", "мультфильм");
        MovieItem third = new MovieItem(3, 3, "Отель Белград","комедия");
        MovieItem fourth = new MovieItem(4, 4, "Джентльмены","боевик");
        MovieItem fifth = new MovieItem(5, 5, "Человек-Невидимка","ужасы");
        MovieItem sixth = new MovieItem(6, 6, "Тролли. Мировой тур","мультфильм");
        MovieItem seventh = new MovieItem(7, 7, "Номер один","комедия");
        MovieItem eighth = new MovieItem(8, 8, "Берегись авто","комедия");
        MovieItem nineth = new MovieItem(9, 9, "Гадкий я","мультфильм");
        MovieItem tenth = new MovieItem(10, 10, "Перестрелка","боевик");
        manager.add(tenth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded5() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, 1, "Бладшот", "боевик");
        MovieItem second = new MovieItem(2, 2, "Вперед", "мультфильм");
        MovieItem third = new MovieItem(3, 3, "Отель Белград","комедия");
        MovieItem fourth = new MovieItem(4, 4, "Джентльмены","боевик");
        MovieItem fifth = new MovieItem(5, 5, "Человек-Невидимка","ужасы");
        MovieItem sixth = new MovieItem(6, 6, "Тролли. Мировой тур","мультфильм");
        MovieItem seventh = new MovieItem(7, 7, "Номер один","комедия");
        MovieItem eighth = new MovieItem(8, 8, "Берегись авто","комедия");
        MovieItem nineth = new MovieItem(9, 9, "Гадкий я","мультфильм");
        MovieItem tenth = new MovieItem(10, 10, "Перестрелка","боевик");
        manager.add(tenth);
        manager.add(first);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{first, tenth};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }
}
