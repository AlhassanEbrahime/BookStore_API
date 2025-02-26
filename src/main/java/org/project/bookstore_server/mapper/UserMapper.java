package org.project.bookstore_server.mapper;

import org.project.bookstore_server.entity.User;
import org.project.bookstore_server.model.user.UserDto;

public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
