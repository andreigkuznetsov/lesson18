package com.yahoo.andreikuz.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/wshop.properties"
})
public interface AppConfig extends Config {

    @Key("webUrl")
    String webUrl();

    @Key("apiUrl")
    String apiUrl();

    @Key("userLogin")
    String userLogin();

    @Key("userPassword")
    String userPassword();
}
