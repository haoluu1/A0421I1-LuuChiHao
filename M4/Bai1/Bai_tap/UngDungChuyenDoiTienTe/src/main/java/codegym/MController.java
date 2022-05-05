package codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MController {
    @GetMapping("")
    public String result(){
        return "index";
    }
    @PostMapping("")
    public String change(@RequestParam double USD , Model model) {
        model.addAttribute("VND" , USD * 23000);
        return "index";
    }
}
