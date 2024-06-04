package School;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {


    private static final String URL = "jdbc:mysql://localhost:3307/school";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void saveStudent(Student student){
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO student (name, age, grade) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, student.getName());
                preparedStatement.setInt(2, student.getAge());
                preparedStatement.setString(3, student.getGrade());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
