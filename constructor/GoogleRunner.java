class GoogleRunner{
	public static void main (String [] args){
		Google Google = new Google();
		Google views = new Google(2000);
		Google list = new Google("Google",2000);
		Google total = new Google("Google",2000,'A');
		Google all = new Google("Google",2000,'A',true);
		Google num = new Google("Google",2000,'A',true,24f);
		Google ok = new Google("Google",2000,'A',true,24f,90.0999);
		Google users = new Google("Google",2000,'A',true,24f,90.0999,766888678);
		
	}
}