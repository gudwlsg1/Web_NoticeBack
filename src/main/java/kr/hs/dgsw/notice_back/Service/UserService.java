package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    int deleteById(Long id);
    Long add(User user);
    int modify(User user);
    User findById(Long id);
    User login(User user);
    User checkAccount(String account);
}
