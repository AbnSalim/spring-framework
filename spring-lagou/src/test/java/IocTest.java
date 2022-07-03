import com.lagou.bean.LagouBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	@Test
	public void testIoc(){

		/**
		 * ApplicationContext是容器的G澳及接口,BeanFactory(顶级容器/根容器,规范了/定义了容器的基础行为)
		 * Spring引用上下文，官方称之为Ioc容器（错误的认识：容器就是Map而已；准确来说，map是ioc容器的一个成员，
		 * 叫做单例池，singletonObjects,容器是一组组件和过程的集合,包括beanFactory、单例池、BeanPostProcessor等以及之间的协作流程)
		 */

		/**
		 * Ioc容器创建管理Bean对象的,Spring Bean是有生命周期的
		 * 构造器执行、初始化方法执行、Bean后置处理器的before/after方法：AbstractApplicationContext#refrash#finishBeanFactoryInitalization
		 * Bean工厂后置处理器初始化、方法执行：AbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors
		 * Bean后置处理器初始化：AbstractApplicationContext#refresh#registerBeanPostProcessors
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		LagouBean lagouBean = applicationContext.getBean(LagouBean.class);
		System.out.println(lagouBean);
	}
}
