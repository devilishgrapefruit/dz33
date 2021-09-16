package com.dz;

public class Book {
    String writer;
    String name;
    int year;
    String country;
    String genre;

    public Book() {
    }

    public Book(String writer, String name, int year, String country, String genre) {
        this.writer = writer;
        this.name = name;
        this.year = year;
        this.country = country;
        this.genre = genre;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "writer='" + writer + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
