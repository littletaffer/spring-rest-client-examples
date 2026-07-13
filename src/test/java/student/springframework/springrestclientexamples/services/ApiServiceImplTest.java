package student.springframework.springrestclientexamples.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import student.springframework.api.api.domain.User;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @BeforeEach
    public void setUp() throws Exception {
    }

    @Test
    public void testGetUsers() throws Exception {
        List<User> users = apiService.getUsers(3);
        assertEquals(4, users.size());
    }
}
