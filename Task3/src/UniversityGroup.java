import java.util.Arrays;
public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;

    public UniversityGroup (String groupName, int startYear){
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup (String groupName, int startYear, String[] studentArray){
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
        this.studentArray = studentArray;

    }

    public void addStudents(String[] students){
       if(this.studentArray == null){
           this.studentArray = students;
       }
    }

    public String getGroupDescription(){
        return "Name "  + groupName +
                " Year "  + startYear + "-" + endYear +
                " List of students " + Arrays.toString(studentArray);
    }



    public int getEndYear() {
        return endYear;
    }
    public String[] getStudentArray() {
        return studentArray;
    }
    public int getStartYear() {
        return startYear;
    }
    public String getGroupName(){
      return groupName;
    }


}
