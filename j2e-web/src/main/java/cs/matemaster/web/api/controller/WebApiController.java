package cs.matemaster.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MateMaster
 * @since 2022/6/5
 */
@RestController
@RequestMapping("/web-api")
public class WebApiController {

    @GetMapping("/welcome")
    public void welcome() {
        System.out.println("Hello J2E");
    }
}
