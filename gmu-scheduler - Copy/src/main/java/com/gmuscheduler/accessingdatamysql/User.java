package com.gmuscheduler.accessingdatamysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity // This tells Hibernate to make a table out of this class
@Table(name="courses")

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "c_name")
  private String c_name;
  @Column(name = "c_id")
  private String c_id;
  @Column(name = "difficulty")
  private int difficulty;
  @Column(name = "comments")
  private String comments;

  @Column(name = "classStructure")
  private String classStructure;


  public String getC_name() {
    return c_name;
  }
  public void setC_name(String c_name) {
    this.c_name = c_name;
  }
  public String getC_id() {
    return c_id;
  }
  public void setC_id(String c_id) {
    this.c_id = c_id;
  }
  public int getDifficulty() {
    return difficulty;
  }
  public void setDifficulty(int difficulty) {
    this.difficulty = difficulty;
  }
  public String getComments() {
    return comments;
  }

  public void setComments() {
    this.comments = comments;
  }
  public String getClassStructure() {
    return classStructure;
  }

  public void setClassStructure(String classStructure) {
    this.classStructure = classStructure;
  }
}