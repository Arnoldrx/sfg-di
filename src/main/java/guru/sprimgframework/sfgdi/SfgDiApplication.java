package guru.sprimgframework.sfgdi;

import guru.sprimgframework.sfgdi.controllers.*;
import guru.sprimgframework.sfgdi.dataSource.FakeDataSource;
import guru.sprimgframework.sfgdi.services.PrototypeBean;
import guru.sprimgframework.sfgdi.services.Singletonbean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = (PetController) ctx.getBean("petController", PetController.class);

        System.out.println("---This Best Pet is ---");

        System.out.println(petController.whichisTheBest());

        I18NController i18NController = (I18NController) ctx.getBean("i18NController");

        System.out.println(i18NController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("........Primary Bean");

        System.out.println(myController.sayHello());

        System.out.println(".............. Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println(".............. Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println(".............. Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("----------Bean Scope-------");
        Singletonbean singletonBean1 = ctx.getBean(Singletonbean.class);
        System.out.println(singletonBean1.getMyScope());
        Singletonbean singletonBean2 = ctx.getBean(Singletonbean.class);
        System.out.println(singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcurl());
    }

}
