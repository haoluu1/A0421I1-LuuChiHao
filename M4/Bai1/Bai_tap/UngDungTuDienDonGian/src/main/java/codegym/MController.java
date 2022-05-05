package codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MController {
    Service service= new Service();
    @GetMapping("")
    public String result(){
        return "index";
    }
    @PostMapping("")
    public String transaction(@RequestParam String input, Model model){
        model.addAttribute("result", service.search(input));
        return "index";
    }
}
