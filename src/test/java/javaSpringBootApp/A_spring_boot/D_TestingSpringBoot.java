package javaSpringBootApp.A_spring_boot;

import javaSpringBootApp.JavaSpringBootAppApplication;
import javaSpringBootApp.components.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//contoh cara melakuakan unit test atau testing pada spring boot, caranya menggunakan annotation @SpringBootTest
//dan panggil class container nya.
@SpringBootTest(classes = JavaSpringBootAppApplication.class)
public class D_TestingSpringBoot {

    //contoh cara menlakukan test bean atau component di spring boot
    @Autowired
    Foo foo;
    @Test
    void testFooBean() {
        Assertions.assertNotNull(this.foo);
    }
}
