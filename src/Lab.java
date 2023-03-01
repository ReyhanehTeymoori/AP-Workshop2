

public class Lab {
    //class of lab
    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;
    //define fields
    public Lab (String teacherName , String dayOfWeek , int maxSize){
        this.teacherName =teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
    //constructor for lab class
    }

    public Student[] getStudents() {

        return students;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getMaxSize() {
        return maxSize;
    }


    public void calAvg(){
        //calculate average
        double sum = 0;


            Student stu1 = new Student("sara ","akbari", "123");
            stu1.setGrade(17);
            Student stu2 = new Student("leila ","mohseni", "456");
            stu2.setGrade(18);
            Student stu3 = new Student("reyhaneh ","teymoori", "789");
            stu3.setGrade(19);
            Student stu4 =  new Student("fatemeh ","ahmadi", "159");
            stu4.setGrade(18);
            Student stu5 =  new Student("mina ","amiri", "357");
            stu5.setGrade(17);
            //define 5 students for set the grades

            stu1.printStudentInfo();
            stu2.printStudentInfo();
            stu3.printStudentInfo();
            stu4.printStudentInfo();
            stu5.printStudentInfo();
            //next we print information of students



        sum = sum+stu1.getGrade()+stu2.getGrade()+stu3.getGrade()+stu4.getGrade()+stu5.getGrade();

        System.out.println("Average : " + sum / 5.0);


    }
    public void printLabInfo(){
        //finally print the information of lab
        System.out.println("\nteacher Name : " + teacherName + "\nDay of week :" + dayOfWeek + "\nmax size : " + maxSize );
    }
}
