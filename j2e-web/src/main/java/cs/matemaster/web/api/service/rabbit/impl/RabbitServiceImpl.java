package cs.matemaster.web.api.service.rabbit.impl;

import cs.matemaster.web.api.service.rabbit.RabbitService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * @author MateMaster
 * @since 2022/6/12
 */
@Service
@AllArgsConstructor
public class RabbitServiceImpl implements RabbitService {

    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(message);
    }

}
