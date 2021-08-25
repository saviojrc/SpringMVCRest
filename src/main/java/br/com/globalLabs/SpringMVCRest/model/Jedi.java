package br.com.globalLabs.SpringMVCRest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "jedi")
public class Jedi implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_jedi")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 3, max = 10, message = "Nome deve conter entre 3 e 10 caracteres")
	@NotBlank(message = "Nome não pode estar em branco")
	@Column(name = "name")
	private String name;

	@NotBlank(message = "Sobrenome não pode estar em branco")
	@Column(name = "last_name")
	private String lastName;

	public Jedi(String name, String lastname) {
		this.name = name;
		this.lastName = lastname;
	}

	public Jedi() {
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}
}
