package nf.co.olle.morosystems.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import nf.co.olle.morosystems.server.Message;

@Service("messageService")
public class MessageService implements IMessageService{

	public static final Logger logger=LoggerFactory.getLogger(MessageService.class);
	
	
	@Override
	public String sendMessage(Message message) {
		logger.info(message.toString());
		return "Thanks";
	}

}
