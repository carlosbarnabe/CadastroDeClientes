package br.com.latostatour.CadastroDeClientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //Annotation que vai mapear o Controller e vai indicar o que é o Controller
@RequestMapping // usado para mapear a rota. colocar as rotas no mesmo lugar

public class Controller {

    @GetMapping("/boasvindas") //Annotation para pegar/puxar informacoes. no caso o metodo boasVindas()
    public String boasvindas() {
        return "essa é a minha primeira mensagem nessa rota.";
    }
}
