package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] items = new MovieItem[0];

    private int lastMoviesToShow = 10;

    public int getLastMoviesToShow() {
        return lastMoviesToShow;
    }

    public void setLastMoviesToShow(int lastMoviesToShow) {
        this.lastMoviesToShow = lastMoviesToShow;
    }

    public void add(MovieItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {
        MovieItem[] result = new MovieItem[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public MovieItem[] getNotAll() {
        MovieItem[] result = new MovieItem[items.length];
        int lastMoviesToShow;
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        MovieItem[] tmp = result - lastMoviesToShow;
        if (result < lastMoviesToShow) {
            return result;
        }
        if (result >= lastMoviesToShow) {
            return lastMoviesToShow;
        }
        return result;
    }
}
