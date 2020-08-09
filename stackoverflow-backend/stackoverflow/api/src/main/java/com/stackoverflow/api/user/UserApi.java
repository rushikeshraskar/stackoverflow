package com.stackoverflow.api.user;


import com.stackoverflow.DAO.UserActionsDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api")
@CrossOrigin("*")
public class UserApi {

    private static final Logger LOG = LoggerFactory.getLogger(UserApi.class.getName());

    private UserActionsDAO userActionsDAO;

    public UserApi(UserActionsDAO userActionsDAO) {
        this.userActionsDAO = userActionsDAO;
    }

    public UserActionsDAO getUserActionsDAO() {
        return userActionsDAO;
    }

    public void setUserActionsDAO(UserActionsDAO userActionsDAO) {
        this.userActionsDAO = userActionsDAO;
    }

    @GetMapping("/getMsg")
    public String getMsg() {
        return "Hello world 123123";
    }

    @GetMapping("/getUserCnt")
    public String getUserCount() {
        Integer users = userActionsDAO.getUserCnt();
        LOG.info("getUserCompleted : {} ", users);
        return "check logs";
    }

}
