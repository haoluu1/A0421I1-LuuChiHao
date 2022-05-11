package codegym.controller;

import codegym.model.Declaration;
import codegym.service.DeclarationService;
import codegym.service.IDeclarationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class MController {
    private IDeclarationService service= new DeclarationService();
    @GetMapping("")
    public ModelAndView showList(){
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("lists",service.findAll());
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        return new ModelAndView("create","declaration",new Declaration());
    }
    @PostMapping("/save")
    public ModelAndView save(Declaration declaration){
        if(declaration.getId()==0){
            Random random=new Random();
            int id= random.nextInt(10000);
            declaration.setId(id);
        }
        service.save(declaration);
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        return modelAndView;
    }
    @GetMapping("{id}/edit")
    public ModelAndView edit(@PathVariable("id") int id){
        ModelAndView modelAndView= new ModelAndView("create","declaration",service.findById(id));
        return modelAndView;
    }
    @GetMapping("{id}/delete")
    public ModelAndView delete(@PathVariable("id") int id){
        service.remove(id);
        ModelAndView modelAndView=new ModelAndView("redirect:/");
        return modelAndView;
    }
}
