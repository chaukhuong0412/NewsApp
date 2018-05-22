package com.example.android.newsapp;

import java.util.Date;

/**
 * Created by User on 5/21/2018.
 */

public class News {
    private String nSectionName;
    private String nTitle;
    private String nWebURL;
    private Date nDate;
    private String nAuthor;

    public News(String sectionName, String title, String url, Date date, String author) {
        nSectionName = sectionName;
        nTitle = title;
        nWebURL = url;
        nDate = date;
        nAuthor = author;
    }

    public String getnSectionName() {
        return nSectionName;
    }

    public String getnTitle() {
        return nTitle;
    }

    public String getnWebURL() {
        return nWebURL;
    }

    public Date getnDate() {
        return nDate;
    }

    public String getnAuthor() {
        return nAuthor;
    }
}