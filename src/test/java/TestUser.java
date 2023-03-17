import com.alibaba.fastjson.JSON;
import com.example.dubboconsumer.DubboConsumerApplication;
import com.example.dubboconsumer.User;
import com.example.dubboconsumer.UserApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description: TODO
 * @Author: tiantianlikeU。
 * @Date: 2023/3/12 14:19
 */
@SpringBootTest(classes = DubboConsumerApplication.class)
@RunWith(SpringRunner.class)
public class TestUser {

    @DubboReference
    UserApi userProvider;

    @Test
    public void testUser() throws Exception {



        User user = userProvider.getUser(111);
        System.out.println(JSON.toJSON(user));
    }



}
