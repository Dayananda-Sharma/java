class StoryRunner{
public static void main(String [] args){ 
	String name=Story.storyName("Tom & jerry");
	System.out.println(name);
	int story = Story.numOfStory(17);
	System.out.println(story);
	char accept=Story.certified('A');
	System.out.println(accept);
	long amount=Story.storyBookInCome(100);
	System.out.println(amount);
	boolean yes=Story.real(true);
	System.out.println(yes);
	float market=Story.mark(109f);
	System.out.println(market);
	double money=Story.book(20000);
	System.out.println(money);
	}
	  
	  
}