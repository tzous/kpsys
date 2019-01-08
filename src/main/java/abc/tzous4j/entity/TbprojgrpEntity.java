package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbprojgrp", schema = "msadb", catalog = "")
public class TbprojgrpEntity {
    private int gid;
    private Integer rid;
    private String gname;
    private String sid;
    private Integer gstat;

    @Id
    @Column(name = "gid")
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "rid")
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "gname")
    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
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
    @Column(name = "gstat")
    public Integer getGstat() {
        return gstat;
    }

    public void setGstat(Integer gstat) {
        this.gstat = gstat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbprojgrpEntity that = (TbprojgrpEntity) o;

        if (gid != that.gid) return false;
        if (rid != null ? !rid.equals(that.rid) : that.rid != null) return false;
        if (gname != null ? !gname.equals(that.gname) : that.gname != null) return false;
        if (sid != null ? !sid.equals(that.sid) : that.sid != null) return false;
        if (gstat != null ? !gstat.equals(that.gstat) : that.gstat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gid;
        result = 31 * result + (rid != null ? rid.hashCode() : 0);
        result = 31 * result + (gname != null ? gname.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + (gstat != null ? gstat.hashCode() : 0);
        return result;
    }
}
