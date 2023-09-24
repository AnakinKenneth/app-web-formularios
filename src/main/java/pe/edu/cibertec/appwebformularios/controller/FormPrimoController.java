package pe.edu.cibertec.appwebformularios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.cibertec.appwebformularios.model.PrimoModel;

@Controller
public class FormPrimoController {

@GetMapping("/numeroprimo")
    public String index(Model model){
        model.addAttribute("primomodel", new PrimoModel());
        return "formPrimo";
    }
@PostMapping("/numeroprimo")
    public String validarNumeroPrimo(@ModelAttribute("primomodel")PrimoModel primoModel,
                                     Model model){
    String resultado = esPrimo(primoModel.getNumero())
            ? "el numero "+ primoModel.getNumero() +"es PRIMO":
            "el numero "+ primoModel.getNumero() +"no es PRIMO";
    model.addAttribute("verresultado", true);
        model.addAttribute("resultado", resultado);
    return "formPrimo";
    }
    private  Boolean esPrimo(Integer numero){
        Integer contador = 0;
        for(int i = 1; i <= numero; i++){
            if ((numero % i) == 0){
                contador ++;
            }
        }
        return contador <=2;
    }
}
