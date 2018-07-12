package com.clitesol.chd.model;

import org.joda.time.DateTime;
import org.joda.time.DateTime;
import org.springframework.data.annotation.*;

public class BaseModel {

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String lastModifiedBy;
    @Version
    private Long version;
    @CreatedDate
    private DateTime createdAt;
    @LastModifiedDate
    private DateTime lastModified;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
    }
}
