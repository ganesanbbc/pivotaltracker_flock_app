
package com.cts.pivotaltracker.model.tracker;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PivotalEvent {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("project_version")
    @Expose
    private Integer projectVersion;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("highlight")
    @Expose
    private String highlight;
    @SerializedName("changes")
    @Expose
    private List<Change> changes = null;
    @SerializedName("primary_resources")
    @Expose
    private List<PrimaryResource> primaryResources = null;
    @SerializedName("secondary_resources")
    @Expose
    private List<Object> secondaryResources = null;
    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("performed_by")
    @Expose
    private PerformedBy performedBy;
    @SerializedName("occurred_at")
    @Expose
    private Integer occurredAt;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(Integer projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public List<Change> getChanges() {
        return changes;
    }

    public void setChanges(List<Change> changes) {
        this.changes = changes;
    }

    public List<PrimaryResource> getPrimaryResources() {
        return primaryResources;
    }

    public void setPrimaryResources(List<PrimaryResource> primaryResources) {
        this.primaryResources = primaryResources;
    }

    public List<Object> getSecondaryResources() {
        return secondaryResources;
    }

    public void setSecondaryResources(List<Object> secondaryResources) {
        this.secondaryResources = secondaryResources;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public PerformedBy getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(PerformedBy performedBy) {
        this.performedBy = performedBy;
    }

    public Integer getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(Integer occurredAt) {
        this.occurredAt = occurredAt;
    }

    @Override
    public String toString() {
        return "PivotalEvent{" +
                "kind='" + kind + '\'' +
                ", guid='" + guid + '\'' +
                ", projectVersion=" + projectVersion +
                ", message='" + message + '\'' +
                ", highlight='" + highlight + '\'' +
                ", changes=" + changes +
                ", primaryResources=" + primaryResources +
                ", secondaryResources=" + secondaryResources +
                ", project=" + project +
                ", performedBy=" + performedBy +
                ", occurredAt=" + occurredAt +
                '}';
    }
}
