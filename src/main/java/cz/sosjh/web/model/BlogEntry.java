package cz.sosjh.web.model;

import java.time.LocalDateTime;

public class BlogEntry {

    private String id;
    private String title;
    private String author;
    private LocalDateTime created;
    private String content;

    public BlogEntry(String id, String title, String author, LocalDateTime created, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.created = created;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String getContent() {
        return content;
    }
}
