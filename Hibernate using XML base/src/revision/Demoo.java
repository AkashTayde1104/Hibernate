package revision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
@Table(name="Demoo_table")
public class Demoo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id_number")
	private int id;
	@Transient
	private String name;

}
