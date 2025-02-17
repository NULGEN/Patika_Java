package edu.patika.java101;

public class Course {
    private  String name;
    private  String code;
    private  String prefix;
    private  int note;
    public Teacher courseTeacher;

    public Course(String name, String code, String prefix, int note, Teacher courseTeacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.courseTeacher = courseTeacher;
    }

    public  void  addTeacher(Teacher t){

    if(this.getPrefix().equals(t.getBranch())){
        this.courseTeacher = t;
        System.out.println("İşlem başarılı");
    }else{
        System.out.println(t.getName() + " Akademisyeni bu dersi veremez.");
    }
    }

    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(getName() + " dersinin Akademisyeni : "+ courseTeacher.getName());
        }
        else{
            System.out.println(getName() + " dersine Akademisyen atanmamıştır. ");
        }


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
}
