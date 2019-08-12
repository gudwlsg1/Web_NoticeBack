package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Attach;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

public interface AttachService {
    HashMap findById(Long id);
    Long add(Attach attach);
    int modify(Attach attach);
    int deleteById(Long id);
}
