package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbbranch", schema = "msadb", catalog = "")
public class TbbranchEntity {
    private int bid;
    private String bname;
    private int bhid;
    private int bstat;

    @Id
    @Column(name = "bid")
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "bname")
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Basic
    @Column(name = "bhid")
    public int getBhid() {
        return bhid;
    }

    public void setBhid(int bhid) {
        this.bhid = bhid;
    }

    @Basic
    @Column(name = "bstat")
    public int getBstat() {
        return bstat;
    }

    public void setBstat(int bstat) {
        this.bstat = bstat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbbranchEntity that = (TbbranchEntity) o;

        if (bid != that.bid) return false;
        if (bhid != that.bhid) return false;
        if (bstat != that.bstat) return false;
        if (bname != null ? !bname.equals(that.bname) : that.bname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bid;
        result = 31 * result + (bname != null ? bname.hashCode() : 0);
        result = 31 * result + bhid;
        result = 31 * result + bstat;
        return result;
    }
}
