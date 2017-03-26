package nf.co.olle.morosystems.server.service;

import nf.co.olle.morosystems.server.Message;

public interface IMessageService {

	public String sendMessage(Message message);
	public Long getRowCount();
}
