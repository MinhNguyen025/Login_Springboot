package org.securitylogin.service;

import org.securitylogin.model.User;
import org.securitylogin.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
