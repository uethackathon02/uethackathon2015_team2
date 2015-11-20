package com.hackathon.fries.myclass.adapter;

/**
 * Created by TooNies1810 on 11/20/15.
 */
public class ItemTimeLine {
    private String content;
    private int like;
    private int comment;
    private boolean isConfirmByTeacher;

    public ItemTimeLine(String content, int like, int comment, boolean isConfirmByTeacher) {
        this.content = content;
        this.like = like;
        this.comment = comment;
        this.isConfirmByTeacher = isConfirmByTeacher;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public boolean isConfirmByTeacher() {
        return isConfirmByTeacher;
    }

    public void setIsConfirmByTeacher(boolean isConfirmByTeacher) {
        this.isConfirmByTeacher = isConfirmByTeacher;
    }
}
