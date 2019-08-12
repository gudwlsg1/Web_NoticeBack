package kr.hs.dgsw.notice_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private Long id;
    private Long userId;
    private Long postId;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;
}
