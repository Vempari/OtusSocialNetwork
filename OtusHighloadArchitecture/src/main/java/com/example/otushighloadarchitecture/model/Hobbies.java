package com.example.otushighloadarchitecture.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;

@Entity
@Getter
@Setter
@BatchSize(size = 10)
@SequenceGenerator(name = "Hobbie_seq_gen", sequenceName = "hobbie_seq", allocationSize = 1)
public class Hobbies {

	@Id
	@GeneratedValue(generator = "Hobbie_seq_gen", strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable=false)
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "client_id")
	private Client client;

}
