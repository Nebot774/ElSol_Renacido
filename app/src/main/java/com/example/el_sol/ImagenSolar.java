package com.example.el_sol;

public class ImagenSolar {
    private  int imageUrl;
    private String name;

    // Constructor
    public ImagenSolar(int imageUrl, String name) {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    // Getter para imageUrl
    public int getImageUrl() {
        return imageUrl;
    }

    // Setter para imageUrl
    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Getter para name
    public String getName() {
        return name;
    }

    // Setter para name
    public void setName(String name) {
        this.name = name;
    }
}
