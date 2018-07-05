package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.context.annotation.Import
import org.springframework.http.HttpStatus
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@SpringBootTest(webEnvironment = RANDOM_PORT)
class GreetingControllerSpec extends Specification {
    @Autowired
    TestRestTemplate restTemplate

    def '/gretting should return hello world'() {
        when:
        def entity = restTemplate.getForEntity('/greeting', String.class)

        then:
        entity.statusCode == HttpStatus.OK
    }
}