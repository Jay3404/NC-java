package chap19_multithread;

import chap19_multithread.clazz.BoardDAO;

public class _17_threadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDAO boardDAO = new BoardDAO();
		
		for(int i = 0; i < 20; i++) {
			System.out.println(
				boardDAO.selectBoardList()
			);
		}
		
//		Thread thread = new Thread() {
//			@Override
//			public void run() {
//				boardDAO.selectBoardList();
//			}
//		};
	}

}
