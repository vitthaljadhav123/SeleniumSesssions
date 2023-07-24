package SeleniumSessions;

public class GoogleTest {

	
	public static void main(String[] args) {
		
		
		BrowserActions br= new BrowserActions();
		
		br.launchBrowser("chrome");
		br.launchURL("http://www.google.com");
		String title=br.doGetTitle();
		System.out.println("Page title is :"+ title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title ");
		}
		else {
			System.out.println("Title is incorrect");
		
		}
		
		br.quitBrowser();
		}
	
		
		
	}

