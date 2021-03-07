package item2;

public class main {
    public static void main(String[] args) {

        //메서드 연쇄(method chaining)
        Student student = new Student.Builder("ksm",999)
                .sex("man")
                .age(1)
                .height(10)
                .weight(10)
                .build();

        Student2 student2 = Student2.builder()
                .number(999).sex("woman").age(1).build();

        System.out.println(student2.getName());
    }
}
