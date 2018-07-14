package com.clitesol.chd.model;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class ServiceTicket extends BaseModel {

    @Id
    @Field(value = "_id")
    private String id;
    private String subject;
    private String description;
    private String attach_file;
    private String priority;
    private String category;
    private String custId;
    private String techId;
    private String status;
    private DateTime resolveDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttach_file() {
        return attach_file;
    }

    public void setAttach_file(String attach_file) {
        this.attach_file = attach_file;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getTechId() {
        return techId;
    }

    public void setTechId(String techId) {
        this.techId = techId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DateTime getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(DateTime resolveDate) {
        this.resolveDate = resolveDate;
    }
}
