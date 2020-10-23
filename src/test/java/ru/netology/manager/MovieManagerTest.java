package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
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
    MovieItem eleventh = new MovieItem(11, 11, "Мокито", "драма");
    MovieItem twelveth = new MovieItem(12, 12, "Мокито: Возвращение", "драма");

    MovieManager lastMoviesToShow = new MovieManager();

    @Test
    public void shouldAddMovie() {
        manager.add(fifth);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fifth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded() {
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
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded2() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded3() {
        manager.add(first);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded4() {
        manager.add(tenth);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAdded5() {
        manager.add(tenth);
        manager.add(first);
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{first, tenth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFiveOfTenAdded() {
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
        MovieItem[] actual = manager.getNotAll();
        MovieItem[] expected = new MovieItem[]{tenth, nineth, eighth, seventh, sixth};
        assertArrayEquals(expected, actual);
    }
}
