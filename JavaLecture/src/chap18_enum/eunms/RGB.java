package chap18_enum.eunms;

public enum RGB {
	//상수명 RED("red", 255, 0, 0), 
	//	   GREEN, 
	//     BLUE
	RED("red", 255, 0, 0) {
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			for(int i = 0; i < color.length; i++) {
				if(!color[i].equals(this.getColorStr())) {
					if(i != color.length - 1) {
						System.out.print(color[i] + ", ");
					} else {
						System.out.print(color[i] + " ");
					}
				}
			}
			System.out.println("색상이 부족합니다.");
		}
	},
	GREEN("green", 0, 255, 0) {
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			for(int i = 0; i < color.length; i++) {
				if(!color[i].equals(this.getColorStr())) {
					if(i != color.length - 1) {
						System.out.print(color[i] + ", ");
					} else {
						System.out.print(color[i] + " ");
					}
				}
			}
			System.out.println("색상이 부족합니다.");
		}
	},
	BLUE("blue", 0, 0, 255) {
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			for(int i = 0; i < color.length; i++) {
				if(!color[i].equals(this.getColorStr())) {
					if(i != color.length - 1) {
						System.out.print(color[i] + ", ");
					} else {
						System.out.print(color[i] + " ");
					}
				}
			}
			System.out.println("색상이 부족합니다.");
		}
	};
	
	private String colorStr;
	private int red;
	private int green;
	private int blue;
	
	RGB(String colorStr, int red, int green,
			int blue) {
		this.colorStr = colorStr;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public String getColorStr() {
		return colorStr;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}
	
	public abstract void makeWhite();
}
