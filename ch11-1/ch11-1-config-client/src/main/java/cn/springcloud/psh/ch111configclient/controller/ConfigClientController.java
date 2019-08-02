package cn.springcloud.psh.ch111configclient.controller;

import cn.springcloud.psh.ch111configclient.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Autowired
    private ConfigInfoProperties configurationProperties;

    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
        return configurationProperties.getConfig();
    }
}
