package com.zp.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 定义一个Sutdent类,属性:姓名，班号，成绩
 * 放入到list中，统计出每个班级的总分和平均分，分别打印出来
 * 已面向对象的思维解决 
 * @author 25045
 *
 */
public class StudentTest {
  public static void main(String[] args) {
   List<Student> list=new ArrayList<Student>();
   //放入学生的成绩
   exam(list);
   Map<String,ClassRoom> roomsMap=new HashMap<String, ClassRoom>();
   //统计
   count(roomsMap,list);
   Set<String> keySet = roomsMap.keySet();
   for (String string : keySet) {
	   ClassRoom classRoom = roomsMap.get(string);
	System.err.println("班级号："+string+"  总成绩："+classRoom.getTotal()+"  平均分："+classRoom.getTotal()/classRoom.getCount());
}
}
  
  //统计分数
  public static void count(Map<String,ClassRoom> rooms,List<Student> list) {
	   for (Student student : list) {
		String no=student.getNo();
		double score=student.getScore();
		//根据班级的编号查询map是否存在该班级
		ClassRoom classRoom = rooms.get(no);
		if(classRoom==null) {
			rooms.put(no,new ClassRoom(no,score,1));
		}else {
			classRoom.setTotal(classRoom.getTotal()+score);
			classRoom.setCount(classRoom.getCount()+1);
			rooms.put(no,classRoom);
		}
	}
  }
  
  public static  void exam(List<Student> list) {
	  list.add(new Student("a","001",80));
	  list.add(new Student("b","001",50));
	  list.add(new Student("c","001",40));
	  list.add(new Student("a","002",50));
	  list.add(new Student("ds","002",80));
	  list.add(new Student("asd","001",80));
  }
}
//来一个类来存储班级号和学生的信息
class ClassRoom{
	 private String no;
	 private double total;
	 private int count;
	 
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public ClassRoom(String no, double total, int count) {
		super();
		this.no = no;
		this.total = total;
		this.count = count;
	}
	public ClassRoom() {
		super();
	}
}

