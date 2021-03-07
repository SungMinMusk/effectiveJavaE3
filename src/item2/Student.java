package item2;

public class Student {
    private final String name;
    private final int number;
    private final String sex;
    private final int age;
    private final int height;
    private final int weight;

    public static class Builder {
        //필수매개 변수
        private final String name;
        private final int number;

        //선택 매개 변수 - 기본값으로 초기화 한다.
        private String sex     = "woman";
        private int age        = 0;
        private int height     = 0;
        private int weight     = 0;

        public Builder(String name, int number) {
            this.name = name;
            this.number = number;
        }

        public Builder sex(String val) {
            sex = val; return this;
        }
        public Builder age(int val) {
            age = val; return this;
        }
        public Builder height(int val) {
            height = val; return this;
        }
        public Builder weight(int val) {
            weight = val; return this;
        }
        public Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        name = builder.name;
        number = builder.number;
        sex = builder.sex;
        age = builder.age;
        height = builder.height;
        weight = builder.weight;
    }
}
