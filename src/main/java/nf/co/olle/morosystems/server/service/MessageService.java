package nf.co.olle.morosystems.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import nf.co.olle.morosystems.server.Message;
import nf.co.olle.morosystems.server.dao.IMessageDAO;

/**
 * Service pro prijem zpravy a odeslani do databaze pres dao
 * @author Roman Olle
 *
 */
@Service("messageService")
public class MessageService implements IMessageService{

	public static final Logger logger=LoggerFactory.getLogger(MessageService.class);
	
	private IMessageDAO messageDao;
	
	@Autowired
	@Qualifier("messageDao")
	public void setMessageDao(IMessageDAO messageDao) {
		this.messageDao = messageDao;
	}
	
	/**
	 * Prijem zpravy od klienta a poslani ji do dao pro jeji ulozeni.
	 */
	@Override
	public String sendMessage(Message message) {
		logger.info("sendMessage method");
		logger.info(message.toString());
		messageDao.saveMessage(message);
		return "Message was sent";
	}

}
