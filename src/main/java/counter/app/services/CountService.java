package counter.app.services;

import counter.app.entities.Count;

public interface CountService {
    void increment();
    Count getCountById(Long id);

}
