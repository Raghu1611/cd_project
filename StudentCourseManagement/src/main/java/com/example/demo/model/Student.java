package com.example.demo.model; 
 
import java.util.ArrayList; 
import java.util.List; 
 
import jakarta.persistence.Column; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.JoinTable; 
import jakarta.persistence.ManyToMany; 
import jakarta.persistence.Table; 
import jakarta.persistence.JoinColumn; 
 
@Entity 
@Table(name="student_table") 
public class Student { 
  
 @Id 
 @GeneratedValue(strategy=GenerationType.IDENTITY) 
 @Column(name="student_id") 
 private int id; 
 @Column(name="student_name",nullable=false,length=100) 
 private String name; 
 @Column(name="student_gender",nullable=false,length=10) 
 private String gender; 
 @Column(name="student_dateofbirth",nullable=false,length=20) 
 private String dateofbirth; 
 @Column(name="student_email",nullable=false,unique=true,length=50) 
 private String email; 
 @Column(name="student_password",nullable=false,length=15) 
 private String password; 
 @Column(name="student_location",nullable=false,length=100) 
 private String location; 
 @Column(name="student_contact",nullable=false,unique=true,length=10) 
 private String contact; 
  
   @ManyToMany 
     @JoinTable( 
         name = "student_course", 
         joinColumns = @JoinColumn(name = "student_id"), 
         inverseJoinColumns = @JoinColumn(name = "course_id") 
     ) 
     private List<Course> courses = new ArrayList<>(); 
  
 public int getId() { 
  return id; 
 } 
 public void setId(int id) { 
  this.id = id; 
 } 
 public String getName() { 
  return name; 
 } 
 public void setName(String name) { 
  this.name = name; 
 } 
 public String getGender() { 
  return gender; 
 } 
 public void setGender(String gender) { 
  this.gender = gender; 
 } 
 public String getDateofbirth() { 
  return dateofbirth; 
 } 
 public void setDateofbirth(String dateofbirth) { 
  this.dateofbirth = dateofbirth; 
 } 
 public String getEmail() { 
  return email; 
 } 
 public void setEmail(String email) { 
  this.email = email; 
 } 
 public String getPassword() { 
  return password; 
 } 
 public void setPassword(String password) { 
  this.password = password; 
 } 
 public String getLocation() { 
  return location; 
 } 
 public void setLocation(String location) { 
  this.location = location; 
 } 
 public String getContact() { 
  return contact; 
 } 
 public void setContact(String contact) { 
  this.contact = contact; 
 } 
  
 public List<Course> getCourses() { 
     return courses; 
 } 
 
 public void setCourses(List<Course> courses) { 
     this.courses = courses; 
 } 
 
 
}