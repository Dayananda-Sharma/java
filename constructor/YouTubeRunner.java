class YouTubeRunner{
	public static void main (String [] args){
		YouTube youTube = new YouTube();
		YouTube views = new YouTube(2000);
		YouTube list = new YouTube("youTube",2000);
		YouTube total = new YouTube("youTube",2000,'A');
		YouTube all = new YouTube("youTube",2000,'A',true);
		YouTube num = new YouTube("youTube",2000,'A',true,24f);
		YouTube ok = new YouTube("youTube",2000,'A',true,24f,90.0999);
		YouTube users = new YouTube("youTube",2000,'A',true,24f,90.0999,766888678);
		
	}
}