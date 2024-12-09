
package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class CommentsService {
    private final RestTemplate restTemplate;

    public CommentsService() {
        this.restTemplate = new RestTemplate();
    }

    public List<Map<String, Object>> getAllComments() {
        String url = "https://jsonplaceholder.typicode.com/comments";
        Map<String, Object>[] commentsArray = restTemplate.getForObject(url, Map[].class);
        return Arrays.asList(commentsArray);
    }
}
