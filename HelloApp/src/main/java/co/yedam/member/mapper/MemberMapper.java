package co.yedam.member.mapper;

import co.yedam.member.vo.MemberVO;

public interface MemberMapper {
	public MemberVO login(MemberVO member);
	public int addMember(MemberVO member);
}
