package org.jinkss.controolers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("some")
public class TestController {
    @GetMapping("test")
    public String index(Model model){
        return "test/test1";

    }
}
