package com.example.Practice.Springboot.APIs7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringbootApIs7Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticeSpringbootApIs7Application.class, args);

		LibraryManager libraryManager = new LibraryManager();
		libraryManager.initializeMembers();

		System.out.println("Initiate Members : ");
		libraryManager.displayMembers();

		String memberToDeleteId = "1001";
		System.out.println("Deleting member :"+memberToDeleteId );

		if(libraryManager.deleteMemberById(memberToDeleteId)){
			System.out.println(memberToDeleteId + "removed successfully ");
			System.out.println("Remaining members: ");
			libraryManager.displayMembers();
		}else{
			System.out.println("No matching member found ,List remains unchanged");
		}


	}

}
