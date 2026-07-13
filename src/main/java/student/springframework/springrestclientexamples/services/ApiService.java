package student.springframework.springrestclientexamples.services;

import student.springframework.api.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
