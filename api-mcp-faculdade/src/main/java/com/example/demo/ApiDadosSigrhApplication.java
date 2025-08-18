package com.example.demo;

import java.util.List;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.discentes.DiscenteService;

@SpringBootApplication
public class ApiDadosSigrhApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDadosSigrhApplication.class, args);
	}

	@Bean
	public List<ToolCallback> servidoresTools(DiscenteService servidoresService) {
		return List.of(ToolCallbacks.from(servidoresService));
	}	




}


