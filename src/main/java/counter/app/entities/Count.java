package counter.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "Counters")
public class Count {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long count;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column
    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
