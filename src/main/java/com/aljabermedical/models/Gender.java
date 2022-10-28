package com.aljabermedical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="gender")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setDescription(String description) {this.description = description;}

    public String getDescription() {return description;}
}

