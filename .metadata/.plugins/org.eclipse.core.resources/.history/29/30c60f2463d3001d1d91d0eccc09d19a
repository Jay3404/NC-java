package chap98_homework.nc230404.clazz;

public class NumberPrinter {
	private int num;
	private static boolean isThreadFinished = false;
	
	public synchronized void numPrint1(int a) {
		this.num = a;
		
		for(int i = this.num; i <= 50; i++) {
			if(i % 3 == 0) {
				System.out.println("print1 : " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("print1 실행");
			}
			
			if(i == 50) {
				isThreadFinished = true;
			}
			
			notify();
			
			if(!isThreadFinished) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
//	3번문제
//	public void numPrint1(int a) {
//		this.num = a;
//		
//		for(int i = this.num; i <= 50; i++) {
//			if(i % 3 == 0) {
//				System.out.println("print1 : " + i);
//				
//				try {
//					Thread.sleep(300);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
	
//	4번문제
//	public synchronized void numPrint1(int a) {
//		this.num = a;
//		
//		for(int i = this.num; i <= 50; i++) {
//			if(i % 3 == 0) {
//				System.out.println("print1 : " + i);
//				
//				try {
//					Thread.sleep(300);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
	
	public synchronized void numPrint2(int a) {
		this.num = a;
		
		for(int i = this.num; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println("print2 : " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("print2 실행");
			}
			
			if(i == 100) {
				isThreadFinished = true;
			}
			
			notify();
			if(!isThreadFinished) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
//	3번 문제
//	public void numPrint2(int a) {
//		this.num = a;	
//		for(int i = this.num; i <= 100; i++) {
//			if(i % 5 == 0 && i % 7 == 0) {
//				System.out.println("print2 : " + i);
//				
//				try {
//					Thread.sleep(300);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}	

//	4번 문제
//	public void numPrint2(int a) {
//		synchronized(this) {
//			this.num = a;
//		}
//		for(int i = this.num; i <= 100; i++) {
//			if(i % 5 == 0 && i % 7 == 0) {
//				System.out.println("print2 : " + i);
//				
//				try {
//					Thread.sleep(300);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
}
