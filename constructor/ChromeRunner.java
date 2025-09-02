class ChromeRunner{
		public static void main (String [] args){
		Chrome Chrome = new Chrome();
		Chrome views = new Chrome(2000);
		Chrome list = new Chrome("Chrome",2000);
		Chrome total = new Chrome("Chrome",2000,'A');
		Chrome all = new Chrome("Chrome",2000,'A',true);
		Chrome num = new Chrome("Chrome",2000,'A',true,24f);
		Chrome ok = new Chrome("Chrome",2000,'A',true,24f,90.0999);
		Chrome users = new Chrome("Chrome",2000,'A',true,24f,90.0999,766888678);
		
	}
}