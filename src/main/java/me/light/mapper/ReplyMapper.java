package me.light.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.light.model.Criteria;
import me.light.model.ReplyVO;

public interface ReplyMapper {
	List<ReplyVO> getListAll();
	int insert(ReplyVO vo);
	ReplyVO read(Long rno);
	int delete(Long rno);
	int update(ReplyVO vo);
	
	//2개이상 쓸때 param 써야함
	List<ReplyVO> getListWithPaging(
		@Param("cri") Criteria cri,
		@Param("bno") Long bno
	);
}
