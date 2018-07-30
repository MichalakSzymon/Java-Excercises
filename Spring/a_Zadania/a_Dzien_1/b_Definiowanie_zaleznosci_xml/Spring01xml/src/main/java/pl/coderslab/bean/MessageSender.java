package pl.coderslab.bean;

import pl.coderslab.bean.MessageService;

public class MessageSender {
	
	String message;
	MessageService messageService;
	
	public MessageSender(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public void sendMessage(String message) {
		messageService.send(message);
	}
}
