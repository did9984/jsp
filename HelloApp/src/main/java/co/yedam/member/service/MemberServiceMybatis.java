package co.yedam.member.service;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.member.mapper.MemberMapper;
import co.yedam.member.vo.MemberVO;

public class MemberServiceMybatis implements MemberService {
	SqlSession session = DataSource.getInstance().openSession(true);
	MemberMapper mapper = session.getMapper(MemberMapper.class);

	@Override
	public MemberVO login(MemberVO member) {
		return mapper.login(member); // session.selectOne("네임스페이스.");
	}

	@Override
	public int addMember(MemberVO member) {
		return mapper.addMember(member);
	}

}