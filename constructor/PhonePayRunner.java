class PhonePayRunner{
  public static void main (String [] args){
  PhonePay PhonePay = new PhonePay();
  PhonePay user = new PhonePay("PhonePay");
  PhonePay face = new PhonePay("PhonePay",7678);
  PhonePay number = new PhonePay("PhonePay",7678,988766554);
  PhonePay total = new PhonePay("PhonePay",7678,988766554,099900.009);
  PhonePay letter = new PhonePay("PhonePay",7678,988766554,099900.009,'D');
  PhonePay date = new PhonePay("PhonePay",7678,988766554,099900.009,'D',21f);
  PhonePay good = new PhonePay("PhonePay",7678,988766554,099900.009,'D',21f,true);
  
  }
}