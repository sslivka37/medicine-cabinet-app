package org.wecancodeit.medicinecabinetapp.base.classes;

public class Mail {

	private String from;
	private String to;
	private String subject;
	private String text;
	
	public Mail() {
	}
	
	public Mail(String from, String to, String subject, String text) {
		this.from=from;
		this.to=to;
		this.subject=subject;
		this.text=text;
	}
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from=from;
	}
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to=to;
	}
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text=text;
	}
	
	   @Override
	    public String toString() {
	        return "Mail{" +
	                "from='" + from + '\'' +
	                ", to='" + to + '\'' +
	                ", subject='" + subject + '\'' +
	                ", textt='" + text + '\'' +
	                '}';
	    }
	}
	

