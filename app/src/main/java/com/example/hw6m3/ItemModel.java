package com.example.hw6m3;

public class ItemModel {
    private String title;
    private String subtitle;
    private String number;
    private String playtime;

    public ItemModel(String title, String subtitle, String number, String playtime) {
        this.title = title;
        this.subtitle = subtitle;
        this.number = number;
        this.playtime = playtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPlaytime() {
        return playtime;
    }

    public void setPlaytime(String playtime) {
        this.playtime = playtime;
    }
}
