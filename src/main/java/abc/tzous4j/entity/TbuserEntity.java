package abc.tzous4j.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tbuser", schema = "msadb", catalog = "")
public class TbuserEntity {
    private int uid;
    private String uname;
    private String upasswd;
    private int ustat;
    private String udesc;
    private Timestamp uregister;
    private Timestamp uinvalid;

    @Basic
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "upasswd")
    public String getUpasswd() {
        return upasswd;
    }

    public void setUpasswd(String upasswd) {
        this.upasswd = upasswd;
    }

    @Basic
    @Column(name = "ustat")
    public int getUstat() {
        return ustat;
    }

    public void setUstat(int ustat) {
        this.ustat = ustat;
    }

    @Basic
    @Column(name = "udesc")
    public String getUdesc() {
        return udesc;
    }

    public void setUdesc(String udesc) {
        this.udesc = udesc;
    }

    @Basic
    @Column(name = "uregister")
    public Timestamp getUregister() {
        return uregister;
    }

    public void setUregister(Timestamp uregister) {
        this.uregister = uregister;
    }

    @Basic
    @Column(name = "uinvalid")
    public Timestamp getUinvalid() {
        return uinvalid;
    }

    public void setUinvalid(Timestamp uinvalid) {
        this.uinvalid = uinvalid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbuserEntity that = (TbuserEntity) o;

        if (uid != that.uid) return false;
        if (ustat != that.ustat) return false;
        if (uname != null ? !uname.equals(that.uname) : that.uname != null) return false;
        if (upasswd != null ? !upasswd.equals(that.upasswd) : that.upasswd != null) return false;
        if (udesc != null ? !udesc.equals(that.udesc) : that.udesc != null) return false;
        if (uregister != null ? !uregister.equals(that.uregister) : that.uregister != null) return false;
        if (uinvalid != null ? !uinvalid.equals(that.uinvalid) : that.uinvalid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (upasswd != null ? upasswd.hashCode() : 0);
        result = 31 * result + ustat;
        result = 31 * result + (udesc != null ? udesc.hashCode() : 0);
        result = 31 * result + (uregister != null ? uregister.hashCode() : 0);
        result = 31 * result + (uinvalid != null ? uinvalid.hashCode() : 0);
        return result;
    }
}
