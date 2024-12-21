package com.principal.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	private String nombre;
	private String apellido;
	private String username;
	private String password;
	private String email;
}
