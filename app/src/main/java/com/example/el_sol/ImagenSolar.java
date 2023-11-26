package com.example.el_sol;

public class ImagenSolar {
    private String imageUrl;
    private String name;

    // Constructor
    public ImagenSolar(String imageUrl, String name) {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    // Getter para imageUrl
    public String getImageUrl() {
        return imageUrl;
    }

    // Setter para imageUrl
    public void setImageUrl(String imageUrl) {
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
