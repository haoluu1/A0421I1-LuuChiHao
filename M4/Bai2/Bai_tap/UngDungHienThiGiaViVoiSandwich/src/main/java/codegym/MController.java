package codegym;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MController {
    @GetMapping()
    public String index(){
        return "index";
    }
    @PostMapping("save")
    public String show(@RequestParam("condition") String condition, Model model){
        model.addAttribute("conditions",condition);
        return "index";
    }
}
