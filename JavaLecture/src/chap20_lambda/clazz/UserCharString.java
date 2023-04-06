package chap20_lambda.clazz;

public class UserCharString {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public UserCharString(String str) {
		this.str = str;
	}
	
	public void changeStr(char ch, UserChar uc) {
		this.str = uc.findUserChar(ch, this.str);
	}

	@Override
	public String toString() {
		return "UserCharString [str=" + str + "]";
	}
}
