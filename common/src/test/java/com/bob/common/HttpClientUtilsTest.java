package com.bob.common;

import com.bob.common.util.http.HttpClientResult;
import com.bob.common.util.http.HttpClientUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bobwen
 * @date 2018/9/26
 */
public class HttpClientUtilsTest {
    /**
     * Description: 测试get无参请求
     *
     * @throws Exception
     */
    @Test
    public void testGet() throws Exception {
        HttpClientResult result = HttpClientUtils.doGet("http://127.0.0.1:8080/userapi/hello/get");
        System.out.println(result);
    }

    /**
     * Description: 测试get带参请求
     *
     * @throws Exception
     */
    @Test
    public void testGetWithParam() throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("message", "helloworld");
        HttpClientResult result = HttpClientUtils.doGet("http://127.0.0.1:8080/userapi/hello/getWithParam", params);
        System.out.println(result);
    }

    /**
     * Description: 测试post带请求头不带请求参数
     *
     * @throws Exception
     */
    @Test
    public void testPost() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Cookie", "123");
        headers.put("Connection", "keep-alive");
        headers.put("Accept", "application/json");
        headers.put("Accept-Language", "zh-CN,zh;q=0.9");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");
        HttpClientResult result = HttpClientUtils.doPost("http://127.0.0.1:8080/hello/post", headers, null);
        System.out.println(result);
    }

    /**
     * Description: 测试post带参请求
     *
     * @throws Exception
     */
    @Test
    public void testPostWithParam() throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("code", "0");
        params.put("message", "helloworld");
        HttpClientResult result = HttpClientUtils.doPost("http://127.0.0.1:8080/userapi/hello/postWithParam", params);
        System.out.println(result);
    }

}
