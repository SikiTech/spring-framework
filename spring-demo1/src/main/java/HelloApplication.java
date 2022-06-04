import com.siki.config.HelloConfig;
import com.siki.dao.HelloDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author robert
 */
public class HelloApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloConfig.class);
		HelloDao helloDao = applicationContext.getBean(HelloDao.class);
		helloDao.hello();
	}

}
