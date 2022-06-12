package cs.matemaster.web.api.service.rabbit;

/**
 * @author MateMaster
 * @since 2022/6/12
 */
public interface RabbitService {

    /**
     * 发生消息服务
     *
     * @param message
     */
    void sendMessage(String message);
}
