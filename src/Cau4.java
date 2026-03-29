import java.io.*;

public class Cau4 {
    public static void main(String[] args) {
        String tenFile = "students.txt";
        double maxGPA = -1.0;
        String maxGPAStudent = "";

        try(BufferedReader br = new BufferedReader(new FileReader(tenFile)))
        {
            String line;
            while((line = br.readLine()) != null) {
                if(line.isEmpty()) continue;

                try
                {
                    String[] parts = line.split(",");
                    if (parts.length != 3) continue;
                    String mssv = parts[0].trim();
                    String name = parts[1].trim();
                    double gpa = Double.parseDouble(parts[2].trim());
                    if(gpa >= 0 && gpa <= 10)
                    {
                        if (gpa > maxGPA)
                        {
                            maxGPA = gpa;
                            maxGPAStudent = "MSSV: " + mssv + ", Họ tên: " + name + ", GPA: " + gpa;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Dòng dữ liệu lỗi định dạng số: " + line);
                }
            }

            if(maxGPA != -1.0)
            {
                System.out.println("Sinh viên có GPA cao nhất:");
                System.out.println(maxGPAStudent);
            } else {
                System.out.println("Không có dữ liệu hợp lệ.");
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}