package com.springboot.blog.payload;

import com.springboot.blog.entity.Comment;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private long id;

    //title should not be null nor empty
    //title should have at least 2 characters

    @NotEmpty
    @Size(min = 2,message = "Post should have at least 2 characters")
    private String title;

    //post description should not be null nor empty
    //post description should have at least 10 characters
    @NotEmpty
    @Size(min = 10,message = "Description should have at least 10 characters")
    private String description;

    //Post content should not be null nor empty
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;

}
