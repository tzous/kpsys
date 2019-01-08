package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbform", schema = "msadb", catalog = "")
public class TbformEntity {
    private int fid;
    private String fname;
    private Integer ftype;
    private int fhid;
    private Integer fstat;

    @Id
    @Column(name = "fid")
    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "fname")
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "ftype")
    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    @Basic
    @Column(name = "fhid")
    public int getFhid() {
        return fhid;
    }

    public void setFhid(int fhid) {
        this.fhid = fhid;
    }

    @Basic
    @Column(name = "fstat")
    public Integer getFstat() {
        return fstat;
    }

    public void setFstat(Integer fstat) {
        this.fstat = fstat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbformEntity that = (TbformEntity) o;

        if (fid != that.fid) return false;
        if (fhid != that.fhid) return false;
        if (fname != null ? !fname.equals(that.fname) : that.fname != null) return false;
        if (ftype != null ? !ftype.equals(that.ftype) : that.ftype != null) return false;
        if (fstat != null ? !fstat.equals(that.fstat) : that.fstat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid;
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (ftype != null ? ftype.hashCode() : 0);
        result = 31 * result + fhid;
        result = 31 * result + (fstat != null ? fstat.hashCode() : 0);
        return result;
    }
}
