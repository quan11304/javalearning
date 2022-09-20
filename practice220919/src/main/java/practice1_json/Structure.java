package practice1_json;

import java.util.Date;

public class Structure {
    protected int ID;
    protected String title, description, content;
    protected Date postedAt = new Date();
    protected Date lastUpdatedAt = new Date();

    public Structure(int ID, String title,String description, String content,
                     Date postedAt, Date lastUpdatedAt) {
        this.ID = ID;
        this.title = title;
        this.description = description;
        this.content = content;
        this.postedAt = postedAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

}
