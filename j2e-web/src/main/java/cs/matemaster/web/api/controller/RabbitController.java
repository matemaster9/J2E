package cs.matemaster.web.api.controller;

import cs.matemaster.web.api.facade.rabbit.RabbitFacade;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * MQ例子控制器
 *
 * @author MateMaster
 * @since 2022/6/12
 */

@RestController
@RequestMapping("/mq")
@AllArgsConstructor
@Api("RabbitController")
public class RabbitController {

    private RabbitFacade rabbitFacade;

    @GetMapping("/send")
    @ApiOperation("sendMessage")
    public void send(String message) {
        rabbitFacade.sendMessage(message);
    }

}
