package org.leah.ann.controller;

@Controller
@RequestMapping("/")
public class CiaoController{

@RequestMapping(method=RequestMethod.GET)
public String ciao(ModelMap model){

   model.addAttribute("msg","Ciao Noah");
   return "ciao";
}

@RequestMapping(value="/holla",method=RequestMethod.GET)
public String holla(ModelMap model){

    model.addAttribute("msg", "Holla Noah");

return "holla";
}


}
