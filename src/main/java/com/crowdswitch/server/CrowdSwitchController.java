package com.crowdswitch.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2019/4/29.
 */

@RestController
public class CrowdSwitchController {

    @RequestMapping("/collect")
    public String index() {
        return "Hello World";
    }
}
