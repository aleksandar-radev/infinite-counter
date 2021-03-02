package counter.app.services;

import counter.app.entities.Count;
import counter.app.repositories.CountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountServiceImpl implements CountService {

    private final CountRepository countRepository;

    @Autowired
    public CountServiceImpl(CountRepository countRepository) {
        this.countRepository = countRepository;
    }


    @Override
    public void increment() {
        Count count = countRepository.getOne(1L);
        count.setCount(count.getCount() + 1);
    }

    public Count getCountById(Long id) {
        return this.countRepository.getOne(id);
    }
}
