package cn.kgc.ssm.model;

import java.util.Date;

public class Book {
    private int id;
    private String bookName;
    private String bookAuthor;
    private String bookPulish;
    private int bookPage;
    private double bookPrice;
    private Date createTime;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPulish='" + bookPulish + '\'' +
                ", bookPage=" + bookPage +
                ", bookPrice=" + bookPrice +
                ", createTime=" + createTime +
                '}';
    }

    public Book() {
    }

    public Book(int id, String bookName, String bookAuthor, String bookPulish, int bookPage, double bookPrice, Date createTime) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPulish = bookPulish;
        this.bookPage = bookPage;
        this.bookPrice = bookPrice;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPulish() {
        return bookPulish;
    }

    public void setBookPulish(String bookPulish) {
        this.bookPulish = bookPulish;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
