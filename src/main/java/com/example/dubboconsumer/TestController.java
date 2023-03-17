package com.example.dubboconsumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author: tiantianlikeU。
 * @Date: 2023/3/12 22:11
 */
@Service
public class TestController {

    @DubboReference
    UserApi userProvider;

}
