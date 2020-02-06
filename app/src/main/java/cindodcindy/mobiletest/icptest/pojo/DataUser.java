
package cindodcindy.mobiletest.icptest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;
//import org.apache.commons.lang3.builder.ToStringBuilder;

public class DataUser {

    @SerializedName("active")
    @Expose
    private boolean active;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataUser() {
    }

    /**
     * 
     * @param active
     * @param fullname
     * @param id
     * @param username
     */
    public DataUser(boolean active, String fullname, String id, String username) {
        super();
        this.active = active;
        this.fullname = fullname;
        this.id = id;
        this.username = username;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public DataUser withActive(boolean active) {
        this.active = active;
        return this;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public DataUser withFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataUser withId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public DataUser withUsername(String username) {
        this.username = username;
        return this;
    }
    /*

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("active", active).append("fullname", fullname).append("id", id).append("username", username).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(active).append(fullname).append(id).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return new EqualsBuilder().append(active, rhs.active).append(fullname, rhs.fullname).append(id, rhs.id).append(username, rhs.username).isEquals();
    }

     */

}
