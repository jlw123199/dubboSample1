
package xl.com.consumer;


        import com.xl.service.IUserService;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;


        public class UserServiceConsumer {

            private static Logger logger = LoggerFactory.getLogger(UserServiceConsumer.class);

            public static void main(String args[]) {
                ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
                IUserService userService = (IUserService) ctx.getBean("userServiceaa");
                logger.info("执行结果：" + userService.login("hello", "hello"));



            }
        }
