package pages;

import utils.HttpUtils;
import utils.ReadFileData;

public class BasePage {
	
	ReadFileData testconfig = new ReadFileData("resources/config.properties");
	HttpUtils utils = new HttpUtils();
}
