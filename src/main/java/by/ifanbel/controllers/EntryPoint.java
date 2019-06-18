package by.ifanbel.controllers;

import by.ifanbel.data.repositories.BankRepository;
import by.ifanbel.data.databaseEntities.Heterostructure;
import by.ifanbel.data.databaseEntities.SvgDesign;
import by.ifanbel.data.jspBeans.JspBeanHeterostructure;
import by.ifanbel.data.repositories.HeterostructureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
public class EntryPoint {

    final String ERROR_MESSAGE_HEADER = "Ошибки заполнения полей!";

    @Autowired
    private HeterostructureRepo heterostructureRepo;
   /* @Autowired
    private Bank bank;*/



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
        model.addAttribute(new JspBeanHeterostructure());
        return "editHeterostructurePage";
    }

    @RequestMapping(value = { "/saveHeterostructure" }, method = RequestMethod.POST)
    public String saveHeterostructure(@Valid JspBeanHeterostructure jspBeanHeterostructure, BindingResult bindingResult) {

        StringBuilder errMsg = new StringBuilder();
        for (ObjectError error : bindingResult.getAllErrors()) {
            List<String> errorList = Arrays.asList(error.getDefaultMessage().split(System.lineSeparator()));
            jspBeanHeterostructure.getErrorMessages().addAll(errorList);
        }

        Heterostructure heterostructure = new Heterostructure(jspBeanHeterostructure);
        try {
            SvgDesign.createFile("D:/15.svg", heterostructure);
        } catch (IOException e) {
            e.printStackTrace();
        }

        heterostructureRepo.saveAndFlush(heterostructure);



      //  Bank bank = new Bank("without schema 999");
     //  bankRepository.saveAndFlush(bank);
     //   System.out.println(bank.toString());

        new ModelAndView().addObject(jspBeanHeterostructure);

        return "editHeterostructurePage";
    }
}

