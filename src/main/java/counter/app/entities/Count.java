package counter.app.entities;

import javax.persistence.*;

@Entity
public class Count {

    @Id
    @GeneratedValue
    private long id;
    private long count;

    public Count() {
    }

    public Count(long id, long count) {
        this.id = id;
        this.count = count;
    }

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
