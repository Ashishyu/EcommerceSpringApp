package com.example.EcommerceSpringApp.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatedProductData{
	private String color;
	private String discount;
	private String model;
	private String id;
	private String title;
	private String category;
	private String brand;
}