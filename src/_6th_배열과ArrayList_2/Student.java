package _6th_�迭��ArrayList_2;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScore(score);
		subjectList.add(subject);	
		}
	public void showStudentInfo() {
		int total=0;
		for(Subject s : subjectList) {
			total += s.getScore();
			System.out.println("�л� " + studentName + "�� " + s.getSubjectName() + " ���� ������ "+
			s.getScore() + "�Դϴ�.");
		}
		System.out.println("�л� "+studentName + "�� ������ "+total + "�Դϴ�.");
		}
	}
	