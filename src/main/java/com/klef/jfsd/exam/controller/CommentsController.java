
package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

    @GetMapping("/comments")
    public List<Map<String, Object>> viewAllComments() {
        return commentsService.getAllComments();
    }
}
