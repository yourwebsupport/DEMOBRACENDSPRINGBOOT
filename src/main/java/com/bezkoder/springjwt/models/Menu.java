package com.bezkoder.springjwt.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name="menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long version;

    @JoinColumn(name = "parent_id")
    private long parentId;

    @JoinColumn(name = "role_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Role role;

    private String module;

    private String menu_name;

    private long menu_order;

    private String router_link;
    private String translate;
    private String target;
    private long is_active;
    private String href;
    private String icon;
    private String icon_type;
}
