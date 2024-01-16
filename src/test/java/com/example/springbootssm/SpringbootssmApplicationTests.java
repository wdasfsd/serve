package com.example.springbootssm;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootssmApplicationTests {
    IPage page;
@Autowired
    BookDao bookDao;
    @Test
    void contextLoads() {
        for (int i=1;i<=4;i++){
            page =new Page(i,2);
            bookDao.selectPage(page,null);
            System.out.println("当前页码值"+page.getCurrent());
            System.out.println("当前页码显示数量"+page.getSize());
            List records = page.getRecords();
            for (Object o :records) {
                System.out.println(o);
            }


        }

        System.out.println("一共多少页"+page.getPages());



    }

}
