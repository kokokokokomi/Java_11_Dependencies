package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTestRepo {
    AfishaRepository repository = new AfishaRepository();

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
    public void shouldSave() {
        repository.save(first);
        Afisha[] actual = repository.findAll();
        Afisha[] expected = new Afisha[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemove() {
        int idToRemove = 1;
        repository.save(first);
        repository.save(second);
        repository.save(third);

        repository.removeById(idToRemove);

        Afisha[] actual = repository.findAll();
        Afisha[] expected = new Afisha[]{third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        int idToFind = 1;
        repository.save(first);
        repository.save(second);
        repository.save(third);

        repository.findById(idToFind);

        Afisha[] actual = repository.findById(idToFind);
        Afisha[] expected = new Afisha[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        repository.save(first);
        repository.save(second);
        repository.save(third);

        repository.removeAll();

        Afisha[] actual = repository.removeAll();
        Afisha[] expected = new Afisha[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveIfNotExist() {
        int idToRemove = 8;
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);

        repository.removeById(idToRemove);

        Afisha[] actual = repository.findAll();
        Afisha[] expected = new Afisha[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}
