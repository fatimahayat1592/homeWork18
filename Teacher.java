package homeWork18;

public class Teacher {
   /* Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes*/
    String name;
    String lastName;
    int teacherId;
    int salary;
    void lessonPlan(){
        System.out.println("Preparing lesson plan");
    }
    void manageClass(){
        System.out.println("Managing the class room");
    }
    void help(){
        System.out.println("Helping the students");
    }
    void assign(){
        System.out.println("Assigning the home work");
    }

}
class MathTeacher extends Teacher {

}
class ChemistryTeacher extends Teacher{

}
class PianoTeacher extends Teacher{

}
class TeacherTester{
    public static void main(String[] args) {
        MathTeacher mt=new MathTeacher();
        mt.name="Aamir";
        mt.lastName="Ali";
        System.out.println(mt.name+" "+mt.lastName);
        mt.lessonPlan();
        ChemistryTeacher ct=new ChemistryTeacher();
        ct.name="Aima";
       System.out.println(ct.name);
       ct.manageClass();
       PianoTeacher pt=new PianoTeacher();
       pt.name="Asma";
        System.out.println(pt.name);
       pt.help();
       Teacher t=new Teacher();
       t.name="Omer";
        System.out.println(t.name);
        t.assign();
    }
}