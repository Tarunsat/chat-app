package com.example.niggachat;

public class ImageUploadInfo {

    public String imageName;

    public String imageURL;
    public String recent;


    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String name, String url,String recent) {

        this.imageName = name;
        this.imageURL= url;
        this.recent=recent;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }
    public String getRecent() {
        return recent;
    }

}
