package codegym.controller;

import codegym.model.Music;
import codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/music")
public class MController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("musics", iMusicService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("music", new Music());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("music") Music music) {
        iMusicService.create(music);
        return "redirect:/music";
    }

    @GetMapping("/{id}/update")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String edit(Music music) {
        iMusicService.update(music);
        return "redirect:/music";
    }

    @GetMapping("/{id}/delete")
    public String ShowDelete(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Music music) {
        iMusicService.delete(music.getId());
        return "redirect:/music";
    }

    @GetMapping("/{id}/listen")
    public String listen(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "/listen";
    }

}
