import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());//OrderNoteComparator
        students.add(new Student("Mustafa",20));
        students.add(new Student("Ahmet",100));
        students.add(new Student("Behlül",45));
        students.add(new Student("Damla",60));
        students.add(new Student("Damla",60));
        students.add(new Student("Cemre",60));

        for(Student stu : students){
            System.out.println(stu.getName());
        }
    }
}