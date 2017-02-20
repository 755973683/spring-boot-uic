package com.qishon.uic.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by myname on 2017/1/23.
 */
@Controller
public class PortalController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!!!";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("nick", "启尚科技!");
        return "welcome";
    }
}
