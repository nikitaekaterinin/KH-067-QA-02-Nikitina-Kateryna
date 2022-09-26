public class Main {
    public static void main(String[] args) {
        UniversityGroup g1 = new UniversityGroup("BM61",2016);
        UniversityGroup g2 = new UniversityGroup("DA91",2019, new String[]{"1", "2", "3"});

        String[] studentsArray = {"4", "5", "6"};
        g1.addStudents(studentsArray);

        System.out.println(g1.getGroupDescription());
        System.err.println(g2.getGroupDescription());

    }

}