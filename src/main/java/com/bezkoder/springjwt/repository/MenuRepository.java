package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Menu;
import com.bezkoder.springjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findAllByRole(Role role);
}
