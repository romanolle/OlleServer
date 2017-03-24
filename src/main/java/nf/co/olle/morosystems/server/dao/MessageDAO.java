package nf.co.olle.morosystems.server.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nf.co.olle.morosystems.server.Message;

/**
 * Ukladani zprav do databaze.
 * @author Roman Olle
 *
 */
@Repository
public class MessageDAO implements IMessageDAO {


	public static final Logger logger=LoggerFactory.getLogger(MessageDAO.class);
	
	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	/**
	 * Ulozeni zpravy od uzivatele do databaze pres hibernate.
	 */
	@Override
	@Transactional
	public void saveMessage(Message message) {
		Session session=factory.getCurrentSession();
		logger.info("save message method");
		session.persist(message);
	}

}
