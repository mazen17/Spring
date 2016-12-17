package test.ano;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Declares this an entity bean
@Entity
// Maps the bean to SQL table "people"
@Table(name = "people")
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	// Map this to the primary key column.
	@GeneratedValue(strategy = GenerationType.AUTO)
	// Database will generate new primary keys, not us.
	private Integer id;

	@Column(length = 32)
	// Truncate column values to 32 characters.
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}