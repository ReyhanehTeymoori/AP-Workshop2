public class Student {
    //class of student
    private String firstName;
    private String lastName;
    private String id;
    private double grade;
    //define fields
    public Student(String firstName , String lastName , String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

        grade = 0;
        //constructor for student
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }


    public void setId(String id) {
        //for checking lendth of id number
        if(id.length() == 7){
            this.id = id;
        }
    }

    public void setGrade(double grade) {
        //for checking range of grades
        if(grade >= 0 && grade <=20) {
            this.grade = grade;
        }
    }

    public void printStudentInfo(){
        //print information of students
        System.out.println( firstName  + lastName + "\nID : " + id + "\nGrade : " + grade);
    }
}
