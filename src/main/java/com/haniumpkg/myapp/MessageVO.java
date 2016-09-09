package com.haniumpkg.myapp;

public class MessageVO {
	
	private String text;
	private PhotoVO photo;
	private MessageButtonVO message_button;
	
	
	public MessageVO(String text)
	{
		this.text = text;
	}
	
	
	public MessageVO(String text, PhotoVO photo, MessageButtonVO message_button)
	{
		this.text = text;
		this.photo = photo;
		this.message_button = message_button;
	}
	
	public String gettext() {
		return text;
	}
	
	public void settext(String text) {
		this.text = text;
	}
	
	public PhotoVO getphoto() {
		return photo;
	}
	
	public void setphoto(PhotoVO photo) {
		this.photo = photo;
	}
	
	
	public MessageButtonVO getMessage_Button() {
		return message_button;
	}
	
	public void setMessage_Button(MessageButtonVO message_button) {
		this.message_button = message_button;
	}
	
}