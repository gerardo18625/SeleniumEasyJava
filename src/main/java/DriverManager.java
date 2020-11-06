import org.openqa.selenium.WebDriver;

public class DriverManager {

  private static DriverManager instance = null;
  private WebDriver webDriver;

  private DriverManager(){

  }

  public static DriverManager getInstance(){
    if(instance == null){
      instance = new DriverManager();
    }
    return instance;
  }


}
