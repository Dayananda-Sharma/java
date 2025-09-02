class PlayStoreRunner{
	public static void main (String [] args){
		PlayStore PlayStore = new PlayStore();
		PlayStore views = new PlayStore(2000);
		PlayStore list = new PlayStore("PlayStore",2000);
		PlayStore total = new PlayStore("PlayStore",2000,'A');
		PlayStore all = new PlayStore("PlayStore",2000,'A',true);
		PlayStore num = new PlayStore("PlayStore",2000,'A',true,24f);
		PlayStore ok = new PlayStore("PlayStore",2000,'A',true,24f,90.0999);
		PlayStore users = new PlayStore("PlayStore",2000,'A',true,24f,90.0999,766888678);
		
	}
}