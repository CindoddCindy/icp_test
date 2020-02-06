
package cindodcindy.mobiletest.icptest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;
//import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserLoginResponse {

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
    public UserLoginResponse() {
    }

    /**
     * 
     * @param data
     * @param description
     * @param statusCode
     */
    public UserLoginResponse(Data data, String description, long statusCode) {
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

    public UserLoginResponse withData(Data data) {
        this.data = data;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserLoginResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    public long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(long statusCode) {
        this.statusCode = statusCode;
    }

    public UserLoginResponse withStatusCode(long statusCode) {
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
        if ((other instanceof UserLoginResponse) == false) {
            return false;
        }
        UserLoginResponse rhs = ((UserLoginResponse) other);
        return new EqualsBuilder().append(description, rhs.description).append(data, rhs.data).append(statusCode, rhs.statusCode).isEquals();
    }

     */

}
