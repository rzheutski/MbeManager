package by.ifanbel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    public String saveHeterostructure(HsFromJsp hsFromJsp) {

        System.out.println(hsFromJsp.getSampleNumber());
        System.out.println(Arrays.asList(hsFromJsp.getThickness()));
        /*System.out.println(Arrays.asList(hsFromJsp.getX()));*/
        new ModelAndView().addObject(hsFromJsp);
     //   System.out.println(hsFromJsp.getLayersFromJsp().get(0).getGrowthMode());
     //   System.out.println(hsFromJsp.getDate());
     //   System.out.println(hsFromJsp.getWaferSize());

        return "editHeterostructurePage";
    }
}

