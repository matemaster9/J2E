package cs.matemaster.web.dao.mq;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author MateMaster
 * @since 2022/6/6
 */
@Data
@Component
@ConfigurationProperties(prefix = RabbitProperties.PREFIX)
public class RabbitProperties {

    public static final String PREFIX = "j2e-rabbit";

    private String host;
    private Integer port;
    private String username;
    private String password;


}
