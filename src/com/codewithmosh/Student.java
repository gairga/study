package com.codewithmosh;

public class Student extends User{

    private String semester;
    protected int IdLicense;

    public Student(int id, String name, String lastname, int age, String semester) {
        super(id, name, lastname, age);
        this.semester = semester;
        this.IdLicense = IdLicense;
    }

    public Student(String semester, int IdLicense) {
        super();
        this.semester = semester;
        this.IdLicense = IdLicense;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    public int getIdLicense() {
        return IdLicense;
    }

    public void setIdLicense(int idLicense) {
        IdLicense = idLicense;
    }

    @Override
    public String toString(){
        return "Student{"
                + "Id=" + this.getId()
                + ", CarnetIdentidad=" + this.getIdLicense()
                + ", Nombre=" + this.getName()
                + ", Apellido=" + this.getLastname()
                + ", Semestre=" + this.getSemester() + '}';
    }
}
