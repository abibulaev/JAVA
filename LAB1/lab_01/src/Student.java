import java.sql.Time;
import java.util.Calendar;

public class Student {
    int id;
    String surname;
    String name;
    String middle_name;
    int day;
    int mount;
    int years;
    String address;
    int phone_num;
    String faculty;
    int course;
    int group;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getLevel() {
        return middle_name;
    }
    public void setLevel(String level) {
        this.middle_name = level;
    }


    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }


    public int getMount() { return mount; }
    public void setMount(int mount) {
        this.mount = mount;
    }


    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public int getPhone_num() {
        return phone_num;
    }
    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }


    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }


    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }





    public Student(int id, String surname, String name, String middle_name, int day, int mount, int years, String address, int phone_num, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
        this.day=day;
        this.mount=mount;
        this.years=years;
        this.address = address;
        this.phone_num = phone_num;
        this.faculty = faculty;
        this.course=course;
        this.group=group;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id= " + id +
                ", surname= " + surname +
                ", name= " + name +
                ", middle_name= " + middle_name +
                ", day= " + day +
                ",mount=" + mount+
                ", years="+ years+
                ", address= " + address +
                ", phone_num =" + phone_num +
                ", faculty= " + faculty +
                ", cousre="+course+
                ", group="+group+
                '}';
    }
};