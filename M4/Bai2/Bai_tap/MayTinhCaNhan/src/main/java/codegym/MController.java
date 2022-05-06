package codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MController {
    @GetMapping()
    public String index(){
        return "index";
    }
    @PostMapping("/action")
    public String handleIndex(@RequestParam("num1") double num1,
                              @RequestParam("num2") double num2,
                              @RequestParam("condition") String condition,
                              Model model){
        double resutl = 0;
        switch (condition){
            case "+": resutl= num1 + num2;
                break;
            case "-": resutl= num1 - num2;
                break;
            case "x": resutl= num1 * num2;
                break;
            default:
                if (num2==0){
                    model.addAttribute("resutl","error");
                    return "index";
                }else{
                    resutl= num1/num2;
                }
        }
        model.addAttribute("resutls",resutl);
        return "index";
    }
}