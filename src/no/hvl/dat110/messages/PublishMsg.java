package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	private String message, topic;
	
	
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message=message;
	}
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public PublishMsg(String msg) {
		this.message=msg;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String msg) {
		this.message = msg;
	}
	@Override
	public String toString() {
		return "Message [type=\" + super.getType() + \", user=\" + super.getUser() + \", topic=\" + getTopic() + \"] ";
	};
	
}
