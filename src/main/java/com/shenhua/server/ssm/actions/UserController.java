package com.shenhua.server.ssm.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shenhua on 2017-11-28-0028.
 *
 * @author shenhua
 *         Email shenhuanet@126.com
 */
@Controller
@RequestMapping("/admin")
public class UserController {

    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "login success.";
    }
}
