package com.example.cc17;

public class Post {
    private String title;
    private String author;
    private String description;
    private int imageResource;

    public Post(String title, String author, String description, int imageResource) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.imageResource = imageResource;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getDescription() { return description; }
    public int getImageResource() { return imageResource; }
}
