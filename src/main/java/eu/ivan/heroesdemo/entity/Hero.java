package eu.ivan.heroesdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "heroes")
public class Hero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;

	public long getId() {
		return id;
	}
	
	public Hero() {
		
	}
	

	public Hero(String name) {
		this.name = name;
	}



	public void setId(Long heroId) {
		this.id = heroId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + "]";
	}
	
	

}
