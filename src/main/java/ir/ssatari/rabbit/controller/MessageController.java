package ir.ssatari.rabbit.controller;

import ir.ssatari.rabbit.message.MessageSender;
import ir.ssatari.rabbit.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rabbitmq-example")
@AllArgsConstructor
public class MessageController {

    private final MessageSender messageSender;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("name") String name, @RequestParam("id") String id) {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        messageSender.sendMessage(product);

        return "Message sent to the broker successfully";
    }
}
