import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static Cat testCat1;

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat testCat = (Cat) applicationContext.getBean("cat");
        Cat testCat1 = (Cat) applicationContext.getBean("cat");


        System.out.println(bean == bean1);
        System.out.println(testCat == testCat1);


    }

}