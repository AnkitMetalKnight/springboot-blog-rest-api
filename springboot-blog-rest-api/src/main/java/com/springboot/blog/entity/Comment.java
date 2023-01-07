package com.springboot.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               //data,allargsconstr,noargscontstructor is used to remove boilerplate code
@AllArgsConstructor
@NoArgsConstructor

@Entity         //entity is used to make this class as a jpa entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id",nullable = false)       //Joincolumn is used to map with a foreign key id in comments
    private Post post;

}
