package com.example.laynefaler.interactivestory_android;

/**
 * Created by laynefaler on 5/16/16.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {return mText;}
    public void setText(String text) {mText = text;}
    public int getNextPage() {return mNextPage;}
    public void setNextPage(int nextPage) {mNextPage = nextPage;}
}
