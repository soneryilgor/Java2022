package core;

public class MailLogger implements Logger{
	
	@Override
	public void log(String data) {
		System.out.println(data + " Mail gonderildi.");
	}
	
}
