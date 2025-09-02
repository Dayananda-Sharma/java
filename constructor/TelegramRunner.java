class TelegramRunner{
	public static void main (String [] args){
  Telegram Telegram = new Telegram();
  Telegram user = new Telegram("Telegram");
  Telegram face = new Telegram("Telegram",7678);
  Telegram number = new Telegram("Telegram",7678,988766554);
  Telegram total = new Telegram("Telegram",7678,988766554,099900.009);
  Telegram letter = new Telegram("Telegram",7678,988766554,099900.009,'D');
  Telegram date = new Telegram("Telegram",7678,988766554,099900.009,'D',21f);
  Telegram good = new Telegram("Telegram",7678,988766554,099900.009,'D',21f,true);
  
  }
}