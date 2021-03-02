package counter.app.services;

import counter.app.entities.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountServiceImpl implements CountService {


    @Autowired
    public CountServiceImpl() {

    }


}
