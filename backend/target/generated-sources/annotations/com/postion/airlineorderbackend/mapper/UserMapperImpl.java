package com.postion.airlineorderbackend.mapper;

import com.postion.airlineorderbackend.dto.UserDto;
import com.postion.airlineorderbackend.model.User;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-13T14:07:06+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );
        userDto.setRole( user.getRole() );

        return userDto;
    }

    @Override
    public User toEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setUsername( userDto.getUsername() );
        user.setPassword( userDto.getPassword() );
        user.setRole( userDto.getRole() );

        return user;
    }

    @Override
    public User updateUserFromDto(UserDto userDto, User user) {
        if ( userDto == null ) {
            return user;
        }

        user.setUsername( userDto.getUsername() );
        user.setPassword( userDto.getPassword() );
        user.setRole( userDto.getRole() );

        return user;
    }
}
