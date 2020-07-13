
package learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/7/10 17:27
 * @Version V1.0
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping("echo")
    public String echo() {
        return "echo";
    }
}
