package azurepipelienpoc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void urlTest() {
	  String currentUrl =  HooksClass.getDriver().getCurrentUrl();
	  System.out.println("CURRENT URL IS " +currentUrl);
	  Assert.assertEquals(currentUrl, "https://www.google.com/");
  }
  
  @Test
  public void titleTest() {
	  String currenTitle =  HooksClass.getDriver().getTitle();
	  System.out.println("CURRENT TITLE IS " +currenTitle);
	  Assert.assertEquals(currenTitle, "Google");
  }
}
