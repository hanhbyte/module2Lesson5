package WriteOnlyClass;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "Join";
        classes = "C05";
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setClasses(String classes) {
        this.classes = classes;
    }
}
