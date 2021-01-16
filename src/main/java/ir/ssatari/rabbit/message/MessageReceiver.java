package ir.ssatari.rabbit.message;

import ir.ssatari.rabbit.model.Product;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @RabbitListener(queues = "${example.rabbitmq.queue}")
    public void receivedMessage(Product product) {
        System.out.println("Received Message From RabbitMQ = " + product);
    }
}
