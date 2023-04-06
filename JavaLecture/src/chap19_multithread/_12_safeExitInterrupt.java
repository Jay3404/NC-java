package chap19_multithread;

import chap19_multithread.clazz.InterruptThread;

public class _12_safeExitInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptThread wt = new InterruptThread();
		
		wt.start();
		
		try {
			//main 스레드 1초동안 일시 정지
			//WhileThread가 1초 반복 실행
			Thread.sleep(1000);
		} catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
		wt.interrupt();
	}

}
