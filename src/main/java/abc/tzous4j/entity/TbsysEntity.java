package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbsys", schema = "msadb", catalog = "")
public class TbsysEntity {
    private int sysid;
    private String sysname;
    private int systat;

    @Id
    @Column(name = "sysid")
    public int getSysid() {
        return sysid;
    }

    public void setSysid(int sysid) {
        this.sysid = sysid;
    }

    @Basic
    @Column(name = "sysname")
    public String getSysname() {
        return sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname;
    }

    @Basic
    @Column(name = "systat")
    public int getSystat() {
        return systat;
    }

    public void setSystat(int systat) {
        this.systat = systat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbsysEntity that = (TbsysEntity) o;

        if (sysid != that.sysid) return false;
        if (systat != that.systat) return false;
        if (sysname != null ? !sysname.equals(that.sysname) : that.sysname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sysid;
        result = 31 * result + (sysname != null ? sysname.hashCode() : 0);
        result = 31 * result + systat;
        return result;
    }
}
