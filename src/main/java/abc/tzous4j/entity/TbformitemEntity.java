package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbformitem", schema = "msadb", catalog = "")
public class TbformitemEntity {
    private int fmid;
    private Integer fid;
    private Integer fnum;
    private Integer ftype;
    private Integer fhtype;
    private String fcontent;
    private Integer fscore;
    private String fmdesc;

    @Id
    @Column(name = "fmid")
    public int getFmid() {
        return fmid;
    }

    public void setFmid(int fmid) {
        this.fmid = fmid;
    }

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "fnum")
    public Integer getFnum() {
        return fnum;
    }

    public void setFnum(Integer fnum) {
        this.fnum = fnum;
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
    @Column(name = "fhtype")
    public Integer getFhtype() {
        return fhtype;
    }

    public void setFhtype(Integer fhtype) {
        this.fhtype = fhtype;
    }

    @Basic
    @Column(name = "fcontent")
    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent;
    }

    @Basic
    @Column(name = "fscore")
    public Integer getFscore() {
        return fscore;
    }

    public void setFscore(Integer fscore) {
        this.fscore = fscore;
    }

    @Basic
    @Column(name = "fmdesc")
    public String getFmdesc() {
        return fmdesc;
    }

    public void setFmdesc(String fmdesc) {
        this.fmdesc = fmdesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbformitemEntity that = (TbformitemEntity) o;

        if (fmid != that.fmid) return false;
        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (fnum != null ? !fnum.equals(that.fnum) : that.fnum != null) return false;
        if (ftype != null ? !ftype.equals(that.ftype) : that.ftype != null) return false;
        if (fhtype != null ? !fhtype.equals(that.fhtype) : that.fhtype != null) return false;
        if (fcontent != null ? !fcontent.equals(that.fcontent) : that.fcontent != null) return false;
        if (fscore != null ? !fscore.equals(that.fscore) : that.fscore != null) return false;
        if (fmdesc != null ? !fmdesc.equals(that.fmdesc) : that.fmdesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fmid;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (fnum != null ? fnum.hashCode() : 0);
        result = 31 * result + (ftype != null ? ftype.hashCode() : 0);
        result = 31 * result + (fhtype != null ? fhtype.hashCode() : 0);
        result = 31 * result + (fcontent != null ? fcontent.hashCode() : 0);
        result = 31 * result + (fscore != null ? fscore.hashCode() : 0);
        result = 31 * result + (fmdesc != null ? fmdesc.hashCode() : 0);
        return result;
    }
}
