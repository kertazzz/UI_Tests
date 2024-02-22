package com.test.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})

public interface WebDriverConfig extends Config {

    @Key("browserSize")
    @DefaultValue("1911x1080")
    String getBrowserSize();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("browserName")
    String getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("pageLoadStrategy")
    @DefaultValue("eager")
    String getPageLoadStrategy();
    @Key("remoteUrl")
    String getRemoteUrl();
}
