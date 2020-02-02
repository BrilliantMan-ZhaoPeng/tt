package com.zp.set;

public class Student implements Comparable<Student>{
 private String name;
 private double score;
@Override
public String toString() {
	return "Student [name=" + name + ", score=" + score + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}
public Student(String name, double score) {
	super();
	this.name = name;
	this.score = score;
}
public Student() {
	super();
}
@Override
public int compareTo(Student o) {
	return this.score>o.getScore()?1:(this.score==o.getScore()?0:-1);
}
}
