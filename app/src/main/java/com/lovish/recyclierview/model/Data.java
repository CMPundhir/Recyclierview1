package com.lovish.recyclierview.model;

public class Data {
    String title , subtitle;
    int img;

    public Data(String title, String subtitle, int img) {
        this.title = title;
        this.subtitle = subtitle;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Data{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", img=" + img +
                '}';
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;

    }
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
