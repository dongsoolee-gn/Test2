package com.genesisnest.test2.web;

import com.genesisnest.test2.web.domain.posts.Posts;
import com.genesisnest.test2.web.domain.posts.PostsRepository;
import com.genesisnest.test2.web.dto.PostsSaveRequestDto;
import com.genesisnest.test2.web.dto.PostsUpdateRequestDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void Loading_Mainpage() {
            String body = this.restTemplate.getForObject("/",String.class);
            assertThat(body).contains("Spring");
    }
}
