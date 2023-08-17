package com.xyl.huangli;

import com.xyl.huangli.service.StaffService;
import com.xyl.huangli.utlis.CodeUtlis;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BibibibiApplicationTests {

    @Autowired
    private StaffService staffService;

    @Autowired
    private CodeUtlis codeUtlis;

    //@Autowired
//private PasswordEncoder passwordEncoder;
//    @Test
//    void contextLoads() {
//        final String encode = passwordEncoder.encode("1223");
//
//        System.out.println(encode);
//    }
    @Test
    void test(){
//        String a = UUID.randomUUID().toString();
//        int index = a.indexOf("-");//获取第一个"_"的位置
//        String before1 = a.substring(0,index);
//        System.out.println("第一个_前面字符串为：" + before1);
String username = "";
//         List<StaffListVo> staffList = staffService.getStaffList(username);
//        System.out.println(staffList);
    }




}
