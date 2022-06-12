package cs.matemaster.web.api.facade.rabbit.impl;

import cs.matemaster.web.api.facade.rabbit.RabbitFacade;
import cs.matemaster.web.api.service.rabbit.RabbitService;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @author MateMaster
 * @since 2022/6/12
 */
@Component
@AllArgsConstructor
public class RabbitFacadeImpl implements RabbitFacade {

    private RabbitService rabbitService;

    @Override
    public void sendMessage(String message) {
        if (StringUtils.isBlank(message)) {
            throw new IllegalArgumentException("message is null");
        }

        rabbitService.sendMessage(message);
    }
}
