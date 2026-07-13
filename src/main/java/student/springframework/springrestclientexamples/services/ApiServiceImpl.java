package student.springframework.springrestclientexamples.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import student.springframework.api.api.domain.User;
import student.springframework.api.api.domain.UserData;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService{

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("http://private-anon-9fc3990b29-apifaketory.apiary-mock.com/api/user?limit=" + limit, UserData.class);
        return userData.getUserData();
    }
}
