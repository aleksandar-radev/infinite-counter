package counter.app.services;

import counter.app.entities.Count;

import java.util.Optional;

public interface CountService {
    void increment();
    Optional<Count> getCountById(Long id);

}
