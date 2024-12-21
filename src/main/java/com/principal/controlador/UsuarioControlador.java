package com.principal.controlador;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.principal.modelo.Usuario;

@Controller
public class UsuarioControlador {
	
	@RequestMapping("/")
	public String redirectToForm() {
		return "redirect:/form";
	}
	
	@RequestMapping("/form")
	public ModelAndView mostrarFormulario() {
		ModelAndView mav = new ModelAndView("formulario");
		mav.addObject("usuario", new Usuario());
		
		return mav;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView mostrarUsuario(@ModelAttribute Usuario user) {
		ModelAndView mav = new ModelAndView("usuario");
		mav.addObject("usuario", user);
		return mav;

	}

}
