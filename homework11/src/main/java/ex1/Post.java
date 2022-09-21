package ex1;

import java.util.Date;

public class Post {
    String title; long id; String description;
    String content; Date lastUpdatedAt; Date postedAt;

    public Post() {}

    public Post(String title, long id, String description, String content, Date lastUpdatedAt, Date postedAt) {
        this.title = title;
        this.id = id;
        this.description = description;
        this.content = content;
        this.lastUpdatedAt = lastUpdatedAt;
        this.postedAt = postedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }
}
