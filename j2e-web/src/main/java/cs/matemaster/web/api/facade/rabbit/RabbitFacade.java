package cs.matemaster.web.api.facade.rabbit;

/**
 * @author MateMaster
 * @since 2022/6/12
 */
public interface RabbitFacade {

    /**
     * 向默认队列发生message
     *
     * @param message
     */
    void sendMessage(String message);
}
