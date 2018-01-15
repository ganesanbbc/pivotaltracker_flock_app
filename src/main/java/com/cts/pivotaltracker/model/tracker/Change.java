
package com.cts.pivotaltracker.model.tracker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Change {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("change_type")
    @Expose
    private String changeType;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("new_values")
    @Expose
    private NewValues newValues;
    @SerializedName("original_values")
    @Expose
    private OriginalValues originalValues;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("story_type")
    @Expose
    private String storyType;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NewValues getNewValues() {
        return newValues;
    }

    public void setNewValues(NewValues newValues) {
        this.newValues = newValues;
    }

    public OriginalValues getOriginalValues() {
        return originalValues;
    }

    public void setOriginalValues(OriginalValues originalValues) {
        this.originalValues = originalValues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoryType() {
        return storyType;
    }

    public void setStoryType(String storyType) {
        this.storyType = storyType;
    }

}
