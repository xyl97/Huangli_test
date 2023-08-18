package com.xyl.huangli.controller;

import com.xyl.huangli.service.PoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PoiController {

    @Autowired
    private PoiService poiService;

    @PostMapping(value = "/fileUpload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request){
//        System.out.println(LoginController.class.getResource("").getPath());
        return poiService.fileUpload(file);
    }

    @RequestMapping(value = "downLoadExcel", method = RequestMethod.GET)
    public void downLoadExcel(HttpServletResponse response) {
        poiService.downLoadExcel(response);
    }
}
