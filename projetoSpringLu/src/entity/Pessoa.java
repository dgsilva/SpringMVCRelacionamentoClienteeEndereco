package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPessoa;
	@Column(length=100)
	private String nome;
	@Column(unique = true)
	private String email;
	
	private String foto;
	@OneToOne(mappedBy = "pessoa",fetch = FetchType.EAGER,cascade= {CascadeType.ALL}) //A pessoa só tem um endereco
	
	private Endereco endereco;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer idPessoa, String nome, String email, String foto) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
		this.foto = foto;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", email=" + email + ", foto=" + foto + ", endereco="
				+ endereco + "]";
	}

	

	
	
	
	

}
