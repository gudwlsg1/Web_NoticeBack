package kr.hs.dgsw.notice_back.Controller;

import kr.hs.dgsw.notice_back.Domain.Attach;
import kr.hs.dgsw.notice_back.Service.AttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.UUID;

@RestController
public class AttachController {

    @Autowired
    private AttachService attachService;

    @PostMapping("/attachment")
    public HashMap upload(HttpServletRequest req, HttpServletResponse resp,
                          @RequestPart MultipartFile upload){
        HashMap<String, Object> map = new HashMap<>();
        PrintWriter printWriter = null;
        OutputStream out = null;
        try{
            String destFilename
                    = "D:/school/3Grade/web/notice/notice_back/upload/"
                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd/"))
                    + UUID.randomUUID().toString() + "_"
                    + upload.getOriginalFilename();
            File destFile = new File(destFilename);

            destFile.getParentFile().mkdir();
            upload.transferTo(destFile);
            /*String destFilename = upload.getName();
            byte[] bytes = upload.getBytes();
            String destFile = req.getServletContext().getRealPath("/img");
            File uploadFile = new File(destFile);

            if(!uploadFile.exists()){
                uploadFile.mkdir();
            }

            destFilename = UUID.randomUUID().toString();
            destFile = destFile + "/" + destFilename;
            out = new FileOutputStream(new File(destFile));
            out.write(bytes);*/

            Attach attach = Attach.builder()
                    .filename(upload.getOriginalFilename())
                    .filepath(destFilename)
                    .build();
            this.attachService.add(attach);
            map.put("fileId", attach.getId());
            map.put("filename", upload.getOriginalFilename());
            map.put("filepath", destFilename);
        } catch (Exception ex){
            map.put("fileId", -1L);
            map.put("error", ex.getLocalizedMessage());
            System.out.println(ex.getLocalizedMessage());
        } finally {
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(printWriter != null){
                printWriter.close();
            }
        }
        return map;
    }
}
