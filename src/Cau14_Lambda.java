import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}

public class Cau14_Lambda {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Việt Khang", 95),
                new Student("Gia Khang", 85),
                new Student("Phúc Khang", 92),
                new Student("Bảo Khanh", 89),
                new Student("Vạn Khải", 36)
        );
        String result = students.stream().filter(s -> s.getScore() >= 50)
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .map(s -> s.getName().toUpperCase() + " - " + s.getScore())
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.print("Kết quả sau khi thực hiện các bước yêu cầu: ");
        System.out.println(result);
    }
}