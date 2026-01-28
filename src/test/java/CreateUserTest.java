import static io.restassured.RestAssured.*;

import java.sql.ResultSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest {
//    @Test
//    public void validateUserDataFromDB() throws Exception {
//
//        // 1. Open DB connection
//        DBUtils.openDBConnection();
//
//        // 2. Fetch record from DB
//        ResultSet rs = DBUtils.executeQuery(
//                "SELECT name, role, email, user_id FROM users WHERE user_id = 1"
//        );
//
//        // 3. Move to first row
//        rs.next();
//
//        Integer Id = rs.getInt("user_id");
//        String name = rs.getString("name");
//        String role = rs.getString("role");
//        String email = rs.getString("email");
//
//        System.out.println("User Id : - " + Id + ", Name : "+name +", role :"+role +", email :"+ email);
//
//        // 4. Validate DB values
//        Assert.assertEquals(name, "Vikash");
//        Assert.assertEquals(role, "QA");
//        Assert.assertEquals(email, "vikash@test.com");
//
//        // 5. Close DB connection
//        DBUtils.closeDBConnection();
//    }
    @Test
    public void testGithubActions(){
        System.out.println("Vikash running the github actions");
    }
}
