/* 
package com.viraj.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleApplicationTests {

    @Test
    void givenSampleApplicationClass_whenVerifyingAnnotations_thenShouldHaveSpringBootApplicationAnnotation() {
		// Act
        boolean hasAnnotation = SampleApplication.class.isAnnotationPresent(SpringBootApplication.class);

		// Assert
        assertTrue("La clase SampleApplication debe tener la anotación @SpringBootApplication", hasAnnotation);
    }

}
*/