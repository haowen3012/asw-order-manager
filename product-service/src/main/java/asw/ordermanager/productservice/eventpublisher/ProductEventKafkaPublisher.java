package asw.ordermanager.productservice.eventpublisher;

import asw.ordermanager.common.api.event.DomainEvent;
import asw.ordermanager.productservice.api.event.ProductServiceEventChannel;
import asw.ordermanager.productservice.domain.ProductEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ProductEventKafkaPublisher implements ProductEventPublisher {

    private final Logger logger = Logger.getLogger(this.getClass().toString());

    @Autowired
    private KafkaTemplate<String, DomainEvent> template;

    private String channel = ProductServiceEventChannel.channel;

    @Override
    public void publish (DomainEvent event){
        logger.info("EVENT PUBLISHER" + event.toString() + "ON CHANNEL: " + channel);
        template.send(channel, event);
    }
}
