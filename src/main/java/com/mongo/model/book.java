package com.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Document(collation = "book")
public class book {
	
@Id
private int id;
private String bookName;
private String autherName;
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
public String getAutherName() {
	return autherName;
}
public void setAutherName(String autherName) {
	this.autherName = autherName;
}
@Override
public String toString() {
	return "book [id=" + id + ", bookName=" + bookName + ", autherName=" + autherName + "]";
}


}
