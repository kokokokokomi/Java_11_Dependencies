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

    @Test
    public void shouldAddMovie() {
        manager.add(fifth);
        MovieItem[] actual = new MovieItem[]{fifth};
        MovieItem[] expected = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastTenAdded() {
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
        MovieItem[] actual = new MovieItem[]{tenth, nineth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MovieItem[] expected = manager.getLastMovies();
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
        manager.setLastMoviesToShow(5);
        MovieItem[] actual = new MovieItem[]{tenth, nineth, eighth, seventh, sixth};
        MovieItem[] expected = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastTwoOfFiveAdded() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.setLastMoviesToShow(2);
        MovieItem[] actual = new MovieItem[]{fifth, fourth};
        MovieItem[] expected = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllLastAddedNotTen() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        MovieItem[] actual = new MovieItem[]{fifth, fourth, third, second, first};
        MovieItem[] expected = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAddedMoreThanTen() {
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
        manager.add(eleventh);
        manager.add(twelveth);
        MovieItem[] actual = new MovieItem[]{twelveth, eleventh, tenth, nineth, eighth, seventh, sixth, fifth, fourth, third};
        MovieItem[] expected = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAddedMoreThanTen2() {
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
        manager.add(eleventh);
        manager.add(twelveth);
        manager.setLastMoviesToShow(2);
        MovieItem[] actual = new MovieItem[]{twelveth, eleventh};
        MovieItem[] expected = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

}
