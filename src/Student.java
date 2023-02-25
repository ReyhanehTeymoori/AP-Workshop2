public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private double grade;
    public Student(String firstName , String lastName , String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

        grade = 0;
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
        if(id.length() == 7){
            this.id = id;
        }
    }

    public void setGrade(double grade) {
        if(grade >= 0 && grade <=20) {
            this.grade = grade;
        }
    }

    public void printStudentInfo(){
        System.out.println( firstName  + lastName + "\nID : " + id + "\nGrade : " + grade);
    }
}
