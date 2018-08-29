package MyBatisix.pojo;

import java.util.Set;

public class Student {
    private Integer sid;

    private String sname;

    public Student(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
   public Student(){

   }
    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", teacher=" + teacher +

                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }

    private Set<Teacher> teacher;
}
