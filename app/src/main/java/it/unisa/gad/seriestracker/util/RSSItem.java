package it.unisa.gad.seriestracker.util;

public class RSSItem {

    private String title;
    private String description;
    private String imageURL;
    private String urlDescription;

    public RSSItem(){

    }
    public RSSItem(String title, String description, String imageURL) {
        this.title = title;
        this.description = description;
        this.imageURL = imageURL;

    }
    public RSSItem(String title){
        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getImageURL() {

        return imageURL;
    }

    public void setImageURL(String imageURL) {

        this.imageURL = imageURL;
    }

    public String getUrlDescription() {
        return urlDescription;
    }

    public void setUrlDescription(String urlDescription) {
        this.urlDescription = urlDescription;
    }

}
