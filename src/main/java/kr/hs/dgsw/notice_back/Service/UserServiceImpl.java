package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.User;
import kr.hs.dgsw.notice_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public User checkAccount(String account) {
        return userMapper.checkAccount(account);
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public Long add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int modify(User user) {
        return 0;
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }
}