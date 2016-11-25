package com.multicampus.biz.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// 2. DAO(Data Access Object) Ŭ����
@Repository
public class BoardDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	// CRUD ��� �޼ҵ�
	// �� ���
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis ������� insertBoard() ��� ó��");
		mybatis.insert("boardDAO.insertBoard",vo);
	}

	// �� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis ������� updateBoard() ��� ó��");
		mybatis.insert("boardDAO.updateBoard",vo);

	}

	// �� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis ������� deleteBoard() ��� ó��");
		mybatis.insert("boardDAO.deleteBoard",vo);

	}

	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis ������� getBoard() ��� ó��");
		return (BoardVO) mybatis.selectOne("boardDAO.getBoard", vo);
	}

	// �� ��� �˻�
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis ������� getBoardList() ��� ó��");
		return (List<BoardVO>) mybatis.selectList("boardDAO.getBoardList", vo);
	}
}










