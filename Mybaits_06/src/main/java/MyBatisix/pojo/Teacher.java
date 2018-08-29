package MyBatisix.pojo;

import java.util.Set;

public class Teacher {
    private int id;

    private String Name;

    private Set<Teacher> teacher;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }


    /*多对多*/
    /*private Set<Student> student;*/
/*多对多*/
   /* @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", student=" + student +
                '}';
    }*/


    /*多对多*/
   /* public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }*/


}
