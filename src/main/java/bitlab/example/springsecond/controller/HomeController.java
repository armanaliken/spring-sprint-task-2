package bitlab.example.springsecond.controller;

import bitlab.example.springsecond.model.ApplicationRequest;
import bitlab.example.springsecond.service.AppReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private AppReqService appReqService;


    @GetMapping("/")
    public String allAppReq(Model model){
        model.addAttribute("applications", appReqService.getAppReq());
        return "allAppReq";
    }

    @GetMapping("/application/add")
    public String addAppReq(){
        return "addAppReq";
    }

    @PostMapping("/application/add")
    public String addAppReq(ApplicationRequest applicationRequest){
        appReqService.addAppReq(applicationRequest);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String newAppReq(Model model){
        model.addAttribute("applications", appReqService.getAppReq());
        return "newAppReq";
    }

    @GetMapping("/old")
    public String oldAppReq(Model model){
        model.addAttribute("applications", appReqService.getAppReq());
        return "oldAppReq";
    }

    @GetMapping("/application/{id}")
    public String editAppReq(@PathVariable Long id, Model model){
        ApplicationRequest applications = appReqService.getAppReqById(id);
        model.addAttribute("applications", applications);
        return "editAppReq";
    }

    @PostMapping("/application/edit")
    public String edit(ApplicationRequest applicationRequest){
        appReqService.editAppReq(applicationRequest);
        return "redirect:/";
    }


    @PostMapping("/application/delete")
    public String delete(Long id){
        appReqService.deleteAppReq(id);
        return "redirect:/";
    }

}
