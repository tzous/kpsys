package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbstfm", schema = "msadb", catalog = "")
public class TbstfmEntity {
    private int sfid;
    private String sid;
    private int pid;
    private int fid;

    @Id
    @Column(name = "sfid")
    public int getSfid() {
        return sfid;
    }

    public void setSfid(int sfid) {
        this.sfid = sfid;
    }

    @Basic
    @Column(name = "sid")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "fid")
    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbstfmEntity that = (TbstfmEntity) o;

        if (sfid != that.sfid) return false;
        if (pid != that.pid) return false;
        if (fid != that.fid) return false;
        if (sid != null ? !sid.equals(that.sid) : that.sid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sfid;
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + pid;
        result = 31 * result + fid;
        return result;
    }
}
