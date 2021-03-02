package item2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class Student2 {

    //default 설정법, 없으면 null
    @Builder.Default
    private String name = "bada";

    private int number;
    private String sex;
    private int age;
    private int height;
    private int weight;
}
