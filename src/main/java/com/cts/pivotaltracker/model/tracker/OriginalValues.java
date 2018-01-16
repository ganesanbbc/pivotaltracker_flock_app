
package com.cts.pivotaltracker.model.tracker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OriginalValues {

    @SerializedName("updated_at")
    @Expose
    private Integer updatedAt;

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "OriginalValues{" +
                "updatedAt=" + updatedAt +
                '}';
    }
}
