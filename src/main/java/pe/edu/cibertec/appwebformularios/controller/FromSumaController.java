package pe.edu.cibertec.appwebformularios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FromSumaController {
    @GetMapping("/promedionotas")
    public String index(){
        return "frmsuma";
    }
}
