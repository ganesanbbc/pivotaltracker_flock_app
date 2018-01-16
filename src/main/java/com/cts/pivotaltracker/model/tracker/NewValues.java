
package com.cts.pivotaltracker.model.tracker;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewValues {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("story_id")
    @Expose
    private Integer storyId;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("person_id")
    @Expose
    private Integer personId;
    @SerializedName("created_at")
    @Expose
    private Integer createdAt;
    @SerializedName("updated_at")
    @Expose
    private Integer updatedAt;
    @SerializedName("file_attachment_ids")
    @Expose
    private List<Object> fileAttachmentIds = null;
    @SerializedName("google_attachment_ids")
    @Expose
    private List<Object> googleAttachmentIds = null;
    @SerializedName("attachment_ids")
    @Expose
    private List<Object> attachmentIds = null;
    @SerializedName("file_attachments")
    @Expose
    private List<Object> fileAttachments = null;
    @SerializedName("google_attachments")
    @Expose
    private List<Object> googleAttachments = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoryId() {
        return storyId;
    }

    public void setStoryId(Integer storyId) {
        this.storyId = storyId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Object> getFileAttachmentIds() {
        return fileAttachmentIds;
    }

    public void setFileAttachmentIds(List<Object> fileAttachmentIds) {
        this.fileAttachmentIds = fileAttachmentIds;
    }

    public List<Object> getGoogleAttachmentIds() {
        return googleAttachmentIds;
    }

    public void setGoogleAttachmentIds(List<Object> googleAttachmentIds) {
        this.googleAttachmentIds = googleAttachmentIds;
    }

    public List<Object> getAttachmentIds() {
        return attachmentIds;
    }

    public void setAttachmentIds(List<Object> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public List<Object> getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(List<Object> fileAttachments) {
        this.fileAttachments = fileAttachments;
    }

    public List<Object> getGoogleAttachments() {
        return googleAttachments;
    }

    public void setGoogleAttachments(List<Object> googleAttachments) {
        this.googleAttachments = googleAttachments;
    }

    @Override
    public String toString() {
        return "NewValues{" +
                "id=" + id +
                ", storyId=" + storyId +
                ", text='" + text + '\'' +
                ", personId=" + personId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", fileAttachmentIds=" + fileAttachmentIds +
                ", googleAttachmentIds=" + googleAttachmentIds +
                ", attachmentIds=" + attachmentIds +
                ", fileAttachments=" + fileAttachments +
                ", googleAttachments=" + googleAttachments +
                '}';
    }
}
