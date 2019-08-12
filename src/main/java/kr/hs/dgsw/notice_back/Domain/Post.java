package kr.hs.dgsw.notice_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {
    private Long id;
    private String title;
    private String content;
    private Long userId;
    private LocalDateTime created;
    private LocalDateTime updated;
}
