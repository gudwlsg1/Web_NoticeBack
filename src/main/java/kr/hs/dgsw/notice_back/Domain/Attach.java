package kr.hs.dgsw.notice_back.Domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Attach {
    private Long id;
    private Long postId;
    private String filename;
    private String filepath;
    private LocalDateTime created;
    private LocalDateTime updated;

    @Builder
    public Attach(Long postId, String filename, String filepath) {
        this.postId = postId;
        this.filename = filename;
        this.filepath = filepath;
    }
}
