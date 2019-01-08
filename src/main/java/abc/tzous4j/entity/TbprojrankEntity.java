package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbprojrank", schema = "msadb", catalog = "")
public class TbprojrankEntity {
    private int rid;
    private Integer pid;
    private String rname;
    private String rdesc;
    private int rscore;
    private int rmode;
    private Integer rself;
    private Integer fid;

    @Id
    @Column(name = "rid")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "rname")
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Basic
    @Column(name = "rdesc")
    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

    @Basic
    @Column(name = "rscore")
    public int getRscore() {
        return rscore;
    }

    public void setRscore(int rscore) {
        this.rscore = rscore;
    }

    @Basic
    @Column(name = "rmode")
    public int getRmode() {
        return rmode;
    }

    public void setRmode(int rmode) {
        this.rmode = rmode;
    }

    @Basic
    @Column(name = "rself")
    public Integer getRself() {
        return rself;
    }

    public void setRself(Integer rself) {
        this.rself = rself;
    }

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbprojrankEntity that = (TbprojrankEntity) o;

        if (rid != that.rid) return false;
        if (rscore != that.rscore) return false;
        if (rmode != that.rmode) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (rname != null ? !rname.equals(that.rname) : that.rname != null) return false;
        if (rdesc != null ? !rdesc.equals(that.rdesc) : that.rdesc != null) return false;
        if (rself != null ? !rself.equals(that.rself) : that.rself != null) return false;
        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (rname != null ? rname.hashCode() : 0);
        result = 31 * result + (rdesc != null ? rdesc.hashCode() : 0);
        result = 31 * result + rscore;
        result = 31 * result + rmode;
        result = 31 * result + (rself != null ? rself.hashCode() : 0);
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        return result;
    }
}
