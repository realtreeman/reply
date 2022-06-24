package me.light.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardMapperTest extends AppTest{

	@Autowired
	BoardMapper mapper; 
	
	@Test
	public void getListTest() {
		System.out.println(mapper.getList());
		System.out.println(mapper.get(1L));
		;
	}

}
