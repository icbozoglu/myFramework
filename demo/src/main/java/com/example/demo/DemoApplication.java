package com.example.demo;

import com.example.demo.dto.impl.PersonelDto;
import com.example.demo.enums.Department;
import com.example.demo.enums.Status;
import com.example.demo.service.impl.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner startup(PersonelService service) {

		return args -> {

			PersonelDto dto = new PersonelDto();
			dto.setBolum(Department.MUHASEBE);
			dto.setMaas(500000);
			dto.setAd("Ali");
			dto.setSoyad("Veli");
			dto.setDurum(Status.AKTIF);
			dto.setDogumTarihi(LocalDate.now());

			UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication();

			dto.setEkleyenKullanici(user == null ? "" : user.getUsername());
			dto.setTCKimlikNo("12345678902");

			dto.setEklenmeZamani(LocalDateTime.now());

			service.add(dto);

		};

	}
}
