package com.company.initialspringbootsetup.services.user;


import com.company.initialspringbootsetup.model.user.User;
import com.company.initialspringbootsetup.services.BaseService;

/**
 *
 */
public interface UserService extends BaseService
{
    User findUserByEmail(String email);

    User findUserById(String id);

    User saveUser(User user);
}
