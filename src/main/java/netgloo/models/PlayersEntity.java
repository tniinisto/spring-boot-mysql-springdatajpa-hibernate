package netgloo.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "players", schema = "dev_areyouin", catalog = "")
public class PlayersEntity {
    private int playerId;
    private String name;
    private String mobile;
    private String mail;
    private String photourl;
    private String password;
    private Byte notify;
    private String firstname;
    private String lastname;
    private Timestamp removed;

    @Id
    @Column(name = "playerID")
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "photourl")
    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "notify")
    public Byte getNotify() {
        return notify;
    }

    public void setNotify(Byte notify) {
        this.notify = notify;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "removed")
    public Timestamp getRemoved() {
        return removed;
    }

    public void setRemoved(Timestamp removed) {
        this.removed = removed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayersEntity that = (PlayersEntity) o;
        return playerId == that.playerId &&
                Objects.equals(name, that.name) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(photourl, that.photourl) &&
                Objects.equals(password, that.password) &&
                Objects.equals(notify, that.notify) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(removed, that.removed);
    }

    @Override
    public int hashCode() {

        return Objects.hash(playerId, name, mobile, mail, photourl, password, notify, firstname, lastname, removed);
    }
}
