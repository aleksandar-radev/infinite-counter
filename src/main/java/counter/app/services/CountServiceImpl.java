package counter.app.services;

import counter.app.repositories.CountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountServiceImpl implements CountService {

    private final CountRepository countRepository;

    @Autowired
    public CountServiceImpl(CountRepository countRepository) {
        this.countRepository = countRepository;
    }


    @Override
    public void increment() {

    }
}
