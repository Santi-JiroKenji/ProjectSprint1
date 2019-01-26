
	package sut.se.team08;


    import sut.se.team08.repository.*;
	import org.springframework.boot.ApplicationRunner;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.Bean;
	import sut.se.team08.entity.*;

	import java.util.*;
	import java.util.stream.Stream;

	@SpringBootApplication
	public class DemoApplication {

		public static void main(String[] args) {
			SpringApplication.run(DemoApplication.class, args);
		}



		@Bean
		ApplicationRunner init(
								HealthLabRepository healthLabRepository,
								StaffPositionRepository staffPositionRepository,
								StaffRepository staffRepository,
								WorkScheduleRepository workScheduleRepository,
								UserRepository userRepository
		){
			return  args -> {


				// For Registration
				Stream.of("ตรวจร่างกาย/สุขภาพทั่วไป", "ตรวจเลือด", "ตรวจโรคติดต่อ", "จักษุ/ทันตกรรม", "X-ray/Untrasound").forEach(lab -> {

					HealthLab healthLab = new HealthLab();
					healthLab.setSName(lab);
					healthLabRepository.save(healthLab);
				});

				// For Staff set Staff
				Stream.of("บันทึกผลการตรวจ", "ประจำอุปกรณ์เครื่องตรวจ", "เก็บตัวอย่าง(เลือด,ปัสสะวะ,ฯลฯ)", "ผู้ช่วยแพทย์", "ติดต่อประสานงาน").forEach(name -> {
					StaffPosition staffPosition = new StaffPosition();
					staffPosition.setStaffPositName(name);
					staffPositionRepository.save(staffPosition);
				});

				// For User Login
				Stream.of("demo", "cpe20").forEach(username ->{

					if(username == "demo"){
						User user = new User();
						user.setUsername(username);
						user.setPassword("123456");
						userRepository.save(user);
					}else{
						User user = new User();
						user.setUsername(username);
						user.setPassword("111111");
						userRepository.save(user);
					}
				});
			};
		}
	}