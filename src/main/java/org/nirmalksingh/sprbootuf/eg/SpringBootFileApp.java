package org.nirmalksingh.sprbootuf.eg;

//package com.javasampleapproach.uploadfile;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootFileApp implements CommandLineRunner{

	@Resource
	FileUploadService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}
