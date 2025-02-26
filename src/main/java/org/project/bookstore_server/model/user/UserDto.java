package org.project.bookstore_server.model.user;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.project.bookstore_server.entity.enums.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String userName;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String email;

    private String password;

    private boolean isEnabled = true;
}
