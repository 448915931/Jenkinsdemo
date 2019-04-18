package com.tqf.jenkins.jenkinsdemo;

import com.tqf.jenkins.jenkinsdemo.servcie.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsdemoApplicationTests {

	@Autowired
	private TestService testService;

	@Test
	public void test1() {
		System.out.println(testService.test());
	}

	@Test
	public void test2() {
		System.out.println(testService.test2());
	}

}
