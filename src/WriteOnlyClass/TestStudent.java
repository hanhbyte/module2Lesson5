package WriteOnlyClass;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Join");
        student1.setClasses("C05");
        student2.setClasses("C06");
        student2.setName("Cuong");
    }
}
