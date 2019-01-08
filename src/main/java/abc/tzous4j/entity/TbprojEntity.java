package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbproj", schema = "msadb", catalog = "")
public class TbprojEntity {
    private int pid;
    private String pname;
    private String pdesc;
    private int ptype;
    private int pscore;
    private int pstat;
    private String period;

    @Id
    @Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pname")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "pdesc")
    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    @Basic
    @Column(name = "ptype")
    public int getPtype() {
        return ptype;
    }

    public void setPtype(int ptype) {
        this.ptype = ptype;
    }

    @Basic
    @Column(name = "pscore")
    public int getPscore() {
        return pscore;
    }

    public void setPscore(int pscore) {
        this.pscore = pscore;
    }

    @Basic
    @Column(name = "pstat")
    public int getPstat() {
        return pstat;
    }

    public void setPstat(int pstat) {
        this.pstat = pstat;
    }

    @Basic
    @Column(name = "period")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbprojEntity that = (TbprojEntity) o;

        if (pid != that.pid) return false;
        if (ptype != that.ptype) return false;
        if (pscore != that.pscore) return false;
        if (pstat != that.pstat) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        if (pdesc != null ? !pdesc.equals(that.pdesc) : that.pdesc != null) return false;
        if (period != null ? !period.equals(that.period) : that.period != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (pdesc != null ? pdesc.hashCode() : 0);
        result = 31 * result + ptype;
        result = 31 * result + pscore;
        result = 31 * result + pstat;
        result = 31 * result + (period != null ? period.hashCode() : 0);
        return result;
    }
}
