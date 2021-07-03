package com.example.otushighloadarchitecture.model;

import com.example.otushighloadarchitecture.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@BatchSize(size = 10)
@SequenceGenerator(name = "Client_seq_gen", sequenceName = "client_seq", allocationSize = 1)
public class Client extends BaseEntity{

	@Id
	@GeneratedValue(generator = "Client_seq_gen", strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable=false)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;

	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Hobbies> hobbies;

	@Column(name = "city")
	private String city;

	@Column(name = "password", length = 100)
	private String password;
}
