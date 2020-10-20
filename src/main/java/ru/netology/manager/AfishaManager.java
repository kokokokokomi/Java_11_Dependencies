package ru.netology.manager;

import ru.netology.repository.AfishaRepository;
import ru.netology.domain.Afisha;

public class AfishaManager {
    private AfishaRepository repository;
    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public void add(Afisha item) {
        repository.save(item);
    }
}
