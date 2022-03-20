package com.friday.test;

import cn.hutool.core.io.IoUtil;
import com.friday.core.io.DefaultResourceLoader;
import com.friday.core.io.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class ResourceLoadTest {
    private DefaultResourceLoader resourceLoader;
    private Resource resource;

    @Before
    public void init(){
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_classpath() throws IOException{
        resource = resourceLoader.getResource("classpath:import.properties");
    }

    @Test
    public void test_file() throws IOException {
        resource = resourceLoader.getResource("src/main/resources/import.properties");
    }

    @Test
    public void test_url(){
        resource = resourceLoader.getResource("https://gitee.com/truexiaohuanxiong/jianyixiaoquwuyeguanlixitong/blob/master/Jenkinsfile");
    }

    @After
    public void print() throws IOException {
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
}
