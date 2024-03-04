# playwright with java : 

So In this project I will automate dummy site - swag labs by using plyawright with Java and other testing tools.




## Dependency : 

      <dependency>
            <groupId>com.microsoft.playwright</groupId>
            <artifactId>playwright</artifactId>
            <version>1.41.2</version>
        </dependency>

## Launching First Test : 

### The line 'Playwright playwright = Playwright.create();' creates an instance of the Playwright class using the create() method. 

Playwright playwright = Playwright.create();

### this line of code creates a new Chromium browser instance using Playwright's API, allowing you to interact with web pages in the Chromium browser programmatically in headless mode.
Browser browser = playwright.chromium().launch();

### Head Mode, By Providing parameters in launch method
Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));

### This line of code creates a new page/tab within the Chromium browser instance
Page page = browser.newPage();

### For opening url : 
page.navigate("https://www.saucedemo.com/v1/");   

### So or basic code will look like this : 
                              
             Playwright playwright = Playwright.create();
             Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
             Page page = browser.newPage();
             page.navigate("https://www.saucedemo.com/v1/");
             System.out.println(page.title());
                           
