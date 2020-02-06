
package cindodcindy.mobiletest.icptest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;
//import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserProfile {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("status_code")
    @Expose
    private long statusCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserProfile() {
    }

    /**
     * 
     * @param data
     * @param description
     * @param statusCode
     */
    public UserProfile(Data data, String description, long statusCode) {
        super();
        this.data = data;
        this.description = description;
        this.statusCode = statusCode;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public UserProfile withData(Data data) {
        this.data = data;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserProfile withDescription(String description) {
        this.description = description;
        return this;
    }

    public long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(long statusCode) {
        this.statusCode = statusCode;
    }

    public UserProfile withStatusCode(long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
/*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).append("description", description).append("statusCode", statusCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(data).append(statusCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserProfile) == false) {
            return false;
        }
        UserProfile rhs = ((UserProfile) other);
        return new EqualsBuilder().append(description, rhs.description).append(data, rhs.data).append(statusCode, rhs.statusCode).isEquals();
    }

 */

}
