package ru.netology.repository;

import ru.netology.domain.Afisha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AfishaRepository {
    private Afisha[] items = new Afisha[0];

    public Afisha[] findAll() { return items; }

    public void save(Afisha item) {
        int length = items.length + 1;
        Afisha[] tmp = new Afisha[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        Afisha[] tmp = new Afisha[length];
        int index = 0;
        for (Afisha item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public Afisha[] removeAll() {
        Afisha[] tmp = new Afisha[0];
        return tmp;
    }

    public Afisha findById(int id) {
        for (Afisha item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
