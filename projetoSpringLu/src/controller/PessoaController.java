package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.Endereco;
import entity.Pessoa;
import persistence.PessoaDao;

@Controller
public class PessoaController {
	
	PessoaDao pd = new PessoaDao();
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView iniciar() {
		ModelAndView mv = new ModelAndView("index");
		try {
			List<Pessoa> lista = pd.findAll();
			mv.addObject("lista", lista);
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		mv.addObject("msg","Bem vindo ao Projeto Spring MVC com Hibernate");
		return mv;
		
	}

	
	@RequestMapping(value ="/cadastrar.html",method =RequestMethod.GET)
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("sistema");
		mv.addObject("msg","Bem vindo ao Projeto Spring MVC com Hibernate");
		return mv;
		
	}
	
	@RequestMapping(value = "/gravar.html",method= RequestMethod.POST)
	public ModelAndView gravar(Pessoa p , Endereco e) {
		ModelAndView mv = new ModelAndView("sistema");
		try {
			pd.create(p, e);
			mv.addObject("msg1","Pessoa e endereco gravado com sucesso");
		}catch(Exception ex) {
			ex.printStackTrace();
			mv.addObject("msg1","Erro:"+ex.getMessage());
		}
		return mv;
	}
	
	
	
}
