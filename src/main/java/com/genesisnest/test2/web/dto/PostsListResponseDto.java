package com.genesisnest.test2.web.dto;

import com.genesisnest.test2.web.domain.posts.Posts;
import lombok.Getter;


@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.content = entity.getContent();


    }
}
