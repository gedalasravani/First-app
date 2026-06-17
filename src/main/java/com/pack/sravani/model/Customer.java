package com.pack.sravani.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	private int custId;
	@Column
	private String custName;
	@Column
	private String custAdd;
	
<<<<<<< Updated upstream
	@column 
	private String custMobile  //bug122 fixed
=======
	@column
	priavte String custpincode  //bug121
	
	
>>>>>>> Stashed changes
	

}
