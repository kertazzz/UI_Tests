package com.test.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.HashMap;


public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class);

    public static void config()  {
        Configuration.baseUrl = WebDriverProvider.config.getBaseUrl();
        Configuration.browserSize = WebDriverProvider.config.getBrowserSize();
        Configuration.browser = WebDriverProvider.config.getBrowserName();
        Configuration.browserVersion = WebDriverProvider.config.getBrowserVersion();
        Configuration.pageLoadStrategy = WebDriverProvider.config.getPageLoadStrategy();
        String remoteUrl = WebDriverProvider.config.getRemoteUrl();

        if (remoteUrl!=null) {

            Configuration.remote = remoteUrl;
            DesiredCapabilities options = new DesiredCapabilities();
            switch(Configuration.browser) {
                case "chrome" :  options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
                break;
                case "firefox" :  options.setCapability(CapabilityType.BROWSER_NAME, "firefox");
                break;
                default: break;
            }
            options.setCapability("selenoid:options", new HashMap<String, Object>() {{
                put("enableVideo", true);
                put("enableVNC", true);
            }});
            Configuration.browserCapabilities = options;

        }






    }
}