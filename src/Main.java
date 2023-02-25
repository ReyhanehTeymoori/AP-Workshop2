public class Main {
   public static void main(String[] args) {
      Student st1 = new Student("james ", "Gosling", "0987654");
      Student st2 = new Student("Dennis ", "Ritchie", "1234567");

      st1.setGrade(18);
      st2.setGrade(17.5);
      st1.printStudentInfo();
      st2.printStudentInfo();
   }
}