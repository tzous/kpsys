package abc.tzous4j.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbprojscores", schema = "msadb", catalog = "")
public class TbprojscoresEntity {
    private int scsid;
    private int scid;
    private int fmid;
    private Integer score;

    @Id
    @Column(name = "scsid")
    public int getScsid() {
        return scsid;
    }

    public void setScsid(int scsid) {
        this.scsid = scsid;
    }

    @Basic
    @Column(name = "scid")
    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    @Basic
    @Column(name = "fmid")
    public int getFmid() {
        return fmid;
    }

    public void setFmid(int fmid) {
        this.fmid = fmid;
    }

    @Basic
    @Column(name = "score")
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbprojscoresEntity that = (TbprojscoresEntity) o;

        if (scsid != that.scsid) return false;
        if (scid != that.scid) return false;
        if (fmid != that.fmid) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scsid;
        result = 31 * result + scid;
        result = 31 * result + fmid;
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
