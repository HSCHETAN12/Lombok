package com.Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PanCard {
	@Id
	private String pNO;
	private String address;
}
