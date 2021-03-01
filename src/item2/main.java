package item2;

public class main {
    public static void main(String[] args) {

        //메서드 연쇄(method chaining)
        Student student = new Student.Builder("ksm",999)
                .sex("male").age(1).height(10).weight(10).build();


        Student student2 = new Student.Builder("bada",991)
                .sex("female").age(1).build();
    }
}
