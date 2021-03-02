package counter.app;

import counter.app.entities.Count;
import counter.app.repositories.CountRepository;
import counter.app.services.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine implements Runnable {

    private final CountRepository countRepository;
    private final CountService countService;

    @Autowired
    public Engine(CountRepository countRepository, CountService countService) {
        this.countRepository = countRepository;
        this.countService = countService;
    }

    @Override
    public void run() {
        Count count = new Count(1, 0);
        this.countRepository.saveAndFlush(count);
    }
}
