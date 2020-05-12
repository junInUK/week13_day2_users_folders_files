package com.example.codeclan.FileUserFolder;

import com.example.codeclan.FileUserFolder.models.File;
import com.example.codeclan.FileUserFolder.models.Folder;
import com.example.codeclan.FileUserFolder.models.User;
import com.example.codeclan.FileUserFolder.repositories.FileRepository;
import com.example.codeclan.FileUserFolder.repositories.FolderRepository;
import com.example.codeclan.FileUserFolder.repositories.UserRepository;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileUserFolderApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testStuff(){
		User jun = new User("jun");
		User lily = new User("lily");
		userRepository.save(jun);
		userRepository.save(lily);

		Folder folder1 = new Folder("models",jun);
		Folder folder2 = new Folder("controller",lily);
		folderRepository.save(folder1);
		folderRepository.save(folder2);

		File file1 = new File("Pirate","java",5.0,folder1);
		File file2 = new File("Ship","java",4.0,folder1);
		File file3 = new File("PirateController","java",6.0,folder2);
		File file4 = new File("ShipController","java",7.2,folder2);
		fileRepository.save(file1);
		fileRepository.save(file2);
		fileRepository.save(file3);
		fileRepository.save(file4);
	}


}
