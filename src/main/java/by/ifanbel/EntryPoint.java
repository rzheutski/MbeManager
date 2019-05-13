package by.ifanbel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class EntryPoint {

    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public String homePage(Model model) {
        return "browseHeterostructurePage";
    }


    /*@RequestMapping(value = { "/newHeterostructure" }, method = RequestMethod.GET)
    public String contactusPage(Model model) {
        model.addAttribute("address", "Vietnam");
        model.addAttribute("phone", "...");
        model.addAttribute("email", "...");
        return "contactusPage";
    } */

    @RequestMapping(value = { "/newHeterostructure" }, method = RequestMethod.GET)
    public String createHeterostructure(Model model) {
        model.addAttribute(new HsFromJsp());
        return "editHeterostructurePage";
    }

    @RequestMapping(value = { "/saveHeterostructure" }, method = RequestMethod.POST)
    public String saveHeterostructure(@Valid HsFromJsp hsFromJsp, BindingResult bindingResult) {

        System.out.println(Arrays.asList(hsFromJsp.getLayerId()));

        System.out.println(bindingResult.hasErrors());
       // System.out.println(bindingResult.getAllErrors().get(0).getDefaultMessage());
        System.out.println(Arrays.asList(hsFromJsp.getY()));





        new ModelAndView().addObject(hsFromJsp);

        return "editHeterostructurePage";
    }
}

