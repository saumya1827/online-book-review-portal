package com.bookreview;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
  @Id
  private String id;
  private String title;
  private String review;

  public String getId() { return id; }
  public void setId(String id) { this.id = id; }
  public String getTitle() { return title; }
  public void setTitle(String title) { this.title = title; }
  public String getReview() { return review; }
  public void setReview(String review) { this.review = review; }
}