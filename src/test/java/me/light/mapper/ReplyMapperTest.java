package me.light.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.light.model.Criteria;
import me.light.model.ReplyVO;


public class ReplyMapperTest extends AppTest{

	@Autowired
	ReplyMapper mapper;
	
	@Test
	@Ignore
	public void getListAllTest() {
		System.out.println(mapper);
		//람다식으로 바꿧음
		mapper.getListAll().forEach(vo -> System.out.println(vo) );
		
	}
	@Test
	@Ignore
	public void insertTest() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(4L);
		vo.setReply("집에 가고오오오오오오 싶어요....");
		vo.setReplyer("테스터");
		mapper.insert(vo);
	}
	@Test
	@Ignore
	public void readTest() {
		System.out.println(mapper.read(9L));
	}

	@Test
	@Ignore
	public void deleteTest() {
		System.out.println(mapper.delete(17L));
	}
	
	@Test
	@Ignore
	public void updateTest() {
		ReplyVO vo = new ReplyVO();
		vo.setRno(1L);
		vo.setReply("202호로 수정합니다");
		mapper.update(vo);
	}
	
	@Test
	@Ignore
	public void listTest() {
		mapper.getListWithPaging(new Criteria(), 1L)
		.forEach(vo -> System.out.println(vo));
	}
}
