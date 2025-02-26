package org.project.bookstore_server.mapper.impl;


import org.project.bookstore_server.entity.User;
import org.project.bookstore_server.mapper.UserMapper;
import org.project.bookstore_server.model.user.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserDto toDto(User user) {
        UserDto newUserDto = new UserDto();
        newUserDto.setUserName(user.getUserName());
        newUserDto.setEmail(user.getEmail());
        newUserDto.setRole(user.getRole());
        newUserDto.setEnabled(user.isEnabled());
        newUserDto.setPassword(user.getPassword());
        return newUserDto;
    }

    @Override
    public User toEntity(UserDto userDto) {
        User newUser = new User();
        newUser.setUserName(userDto.getUserName());
        newUser.setEmail(userDto.getEmail());
        newUser.setPassword(userDto.getPassword());
        newUser.setRole(userDto.getRole());
        newUser.setEnabled(userDto.isEnabled());
        return newUser;

    }
}
