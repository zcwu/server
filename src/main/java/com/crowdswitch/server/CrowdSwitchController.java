package com.crowdswitch.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2019/4/29.
 */

@RestController
public class CrowdSwitchController {

    @RequestMapping("/collect1")
    public String collect1() {
        System.out.println("---CrowdSwitch---");
        System.out.println("New data received: 2019/4/26 14:26:06");
        System.out.println("Operator: China Unicom");
        System.out.println("Signal strength: -78 dBm");
        System.out.println("Longitude: 121.409339;  Latitude: 31.048198");
        System.out.println("Analyzing...");
        System.out.println("Recommend by CrowdSwitch: China Mobile");
        return "Hello World";
    }

    @RequestMapping("/collect2")
    public String collect2() {
        System.out.println("---CrowdSwitch---");
        System.out.println("New data received: 2019/4/26 14:26:21");
        System.out.println("Operator: China Unicom");
        System.out.println("Signal strength: -83 dBm");
        System.out.println("Longitude: 121.408652;  Latitude:31.05011");
        System.out.println("Analyzing...");
        System.out.println("Recommend by CrowdSwitch: China Mobile");
        return "Hello World";
    }

    @RequestMapping("/space")
    public String space() {
        System.out.println("");
        return "Hello World";
    }
}
