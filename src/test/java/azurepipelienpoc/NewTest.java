package azurepipelienpoc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void urlTest() {
	  String currentUrl =  HooksClass.getDriver().getCurrentUrl();
	  System.out.println("CURRENT IS " +currentUrl);
	  Assert.assertEquals(currentUrl, "https://www.google.com/");
  }
}
