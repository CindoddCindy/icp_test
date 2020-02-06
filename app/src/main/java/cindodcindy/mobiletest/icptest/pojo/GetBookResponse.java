
package cindodcindy.mobiletest.icptest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetBookResponse {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("status_code")
    @Expose
    private Long statusCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetBookResponse() {
    }

    /**
     * 
     * @param data
     * @param description
     * @param statusCode
     */
    public GetBookResponse(Data data, String description, Long statusCode) {
        super();
        this.data = data;
        this.description = description;
        this.statusCode = statusCode;
    }

    public DataBook getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public GetBookResponse withData(Data data) {
        this.data = data;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GetBookResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public GetBookResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }

}
