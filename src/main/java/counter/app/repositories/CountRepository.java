package counter.app.repositories;

import counter.app.entities.Count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountRepository extends JpaRepository<Count, Long> {


}
