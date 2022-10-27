package com.bezkoder.springjwt.payload.response;

import com.bezkoder.springjwt.models.Menu;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String username;
    private String fullName;
    private String mobileNo;
    private String email;
    private String occupation;
    private List<String> roles;
    private Set<Menu> menus;
}
