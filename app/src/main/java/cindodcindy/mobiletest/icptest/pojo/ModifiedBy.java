
package cindodcindy.mobiletest.icptest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModifiedBy {

    @SerializedName("fullname")
    @Expose
    private Object fullname;
    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("username")
    @Expose
    private Object username;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModifiedBy() {
    }

    /**
     * 
     * @param fullname
     * @param id
     * @param username
     */
    public ModifiedBy(Object fullname, Object id, Object username) {
        super();
        this.fullname = fullname;
        this.id = id;
        this.username = username;
    }

    public Object getFullname() {
        return fullname;
    }

    public void setFullname(Object fullname) {
        this.fullname = fullname;
    }

    public ModifiedBy withFullname(Object fullname) {
        this.fullname = fullname;
        return this;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public ModifiedBy withId(Object id) {
        this.id = id;
        return this;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public ModifiedBy withUsername(Object username) {
        this.username = username;
        return this;
    }

}
