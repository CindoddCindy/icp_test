
package cindodcindy.mobiletest.icptest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;
//import org.apache.commons.lang3.builder.ToStringBuilder;

public class Data {

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("user")
    @Expose
    private User user;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param user
     * @param token
     */
    public Data(String token, User user) {
        super();
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Data withToken(String token) {
        this.token = token;
        return this;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Data withUser(User user) {
        this.user = user;
        return this;
    }

    /*

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("token", token).append("user", user).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(user).append(token).toHashCode();
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
        return new EqualsBuilder().append(user, rhs.user).append(token, rhs.token).isEquals();
    }

     */

}
