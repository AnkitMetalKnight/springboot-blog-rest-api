package com.springboot.blog.entity;

import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.webresources.StandardRoot;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter                     //data,allargsconstr,noargscontstructor is used to remove boilerplate code
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(

    name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Post {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(name = "title", nullable = false)
    private  String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL, orphanRemoval = true)        //cascade applies all the parent operation to its child classes too.
    private Set<Comment> comments = new HashSet<>();                                //orphanRemoval means if the parent is removed its child are also removed

}
