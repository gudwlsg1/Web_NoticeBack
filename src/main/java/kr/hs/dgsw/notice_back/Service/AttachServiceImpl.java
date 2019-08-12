package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Attach;
import kr.hs.dgsw.notice_back.Domain.AttachMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AttachServiceImpl implements AttachService{

    @Autowired
    private AttachMapper attachMapper;

    @Override
    public HashMap findById(Long id) {
        return attachMapper.findById(id);
    }

    @Override
    public Long add(Attach attach) {
        return attachMapper.add(attach);
    }

    @Override
    public int modify(Attach attach) {
        return attachMapper.modify(attach);
    }

    @Override
    public int deleteById(Long id) {
        return attachMapper.deleteById(id);
    }
}
