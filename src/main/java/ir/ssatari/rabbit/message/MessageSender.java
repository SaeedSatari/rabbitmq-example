package ir.ssatari.rabbit.message;

import ir.ssatari.rabbit.model.Product;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private final AmqpTemplate amqpTemplate;

    public MessageSender(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @Value("${example.rabbitmq.exchange}")
    private String exchange;

    @Value("${example.rabbitmq.routingkey}")
    private String routingkey;

    public void sendMessage(Product product) {
        amqpTemplate.convertAndSend(exchange, routingkey, product);
        System.out.println("Sending Message to RabbitMQ = " + product);
    }
}
