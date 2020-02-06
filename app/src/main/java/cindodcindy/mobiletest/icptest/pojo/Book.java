
package cindodcindy.mobiletest.icptest.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Book {

    @SerializedName("createdAt")
    @Expose
    private Long createdAt;
    @SerializedName("createdBy")
    @Expose
    private CreatedBy createdBy;
    @SerializedName("deletedAt")
    @Expose
    private Object deletedAt;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("modifiedAt")
    @Expose
    private Object modifiedAt;
    @SerializedName("modifiedBy")
    @Expose
    private ModifiedBy modifiedBy;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Book() {
    }

    /**
     * 
     * @param createdAt
     * @param deletedAt
     * @param createdBy
     * @param modifiedAt
     * @param name
     * @param description
     * @param modifiedBy
     * @param id
     */
    public Book(Long createdAt, CreatedBy createdBy, Object deletedAt, String description, String id, Object modifiedAt, ModifiedBy modifiedBy, String name) {
        super();
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.deletedAt = deletedAt;
        this.description = description;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
        this.name = name;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Book withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public Book withCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Book withDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Book withId(String id) {
        this.id = id;
        return this;
    }

    public Object getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Object modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Book withModifiedAt(Object modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    public ModifiedBy getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Book withModifiedBy(ModifiedBy modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book withName(String name) {
        this.name = name;
        return this;
    }

}
