package com.genesisnest.test2.service.posts;

import com.genesisnest.test2.web.domain.posts.Posts;
import com.genesisnest.test2.web.domain.posts.PostsRepository;
import com.genesisnest.test2.web.dto.PostsSaveRequestDto;
import com.genesisnest.test2.web.dto.PostsUpdateRequestDto;
import com.genesisnest.test2.web.dto.PostsResponseDto;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto reqwuestDto) {
        return postsRepository.save(reqwuestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당게시글이 없습니다. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById (Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }

}
