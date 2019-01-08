package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbprojscore", schema = "msadb", catalog = "")
public class TbprojscoreEntity {
    private int scid;
    private int rid;
    private String raterid;
    private String targetid;
    private Integer score;
    private Integer scstst;

    @Id
    @Column(name = "scid")
    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    @Basic
    @Column(name = "rid")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "raterid")
    public String getRaterid() {
        return raterid;
    }

    public void setRaterid(String raterid) {
        this.raterid = raterid;
    }

    @Basic
    @Column(name = "targetid")
    public String getTargetid() {
        return targetid;
    }

    public void setTargetid(String targetid) {
        this.targetid = targetid;
    }

    @Basic
    @Column(name = "score")
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "scstst")
    public Integer getScstst() {
        return scstst;
    }

    public void setScstst(Integer scstst) {
        this.scstst = scstst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbprojscoreEntity that = (TbprojscoreEntity) o;

        if (scid != that.scid) return false;
        if (rid != that.rid) return false;
        if (raterid != null ? !raterid.equals(that.raterid) : that.raterid != null) return false;
        if (targetid != null ? !targetid.equals(that.targetid) : that.targetid != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (scstst != null ? !scstst.equals(that.scstst) : that.scstst != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scid;
        result = 31 * result + rid;
        result = 31 * result + (raterid != null ? raterid.hashCode() : 0);
        result = 31 * result + (targetid != null ? targetid.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (scstst != null ? scstst.hashCode() : 0);
        return result;
    }
}
