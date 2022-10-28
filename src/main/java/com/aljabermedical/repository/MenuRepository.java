package com.aljabermedical.repository;

import com.aljabermedical.models.Menu;
import com.aljabermedical.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findAllByRole(Role role);
}
