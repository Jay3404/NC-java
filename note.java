package chap06_class.animal;

public class bird {
	//날개(int wing), 색깔(String color), 새이름(String name), 크기(int size), 식습관(String food)
	
	//날다(void fly), 운다(void cry), 걷는다(void walk), 먹이를 먹는다(void eat).
	//독수리(name)는 날개를 이용하여 하늘을 납니다.
	//독수리는 나무에 앉아 웁니다.
	//독수리는 땅을 걷는다.
	//독수리는 고기(food)를 먹는다.
	
    public int wing;
    public String color;
    public String name;
    public int size;
    public String food;

    public void fly() {
        System.out.println(name + "는 " + wing + "개 날개를 이용하여 하늘을 납니다.")
    }

    public void cry() {
        System.out.println(name + "는 나무에 앉아 웁니다.")
    }

    public void walk() {
        System.out.println(name + "는 땅을 걷는다.")
    }
	
	public void eat() {
        System.out.println(name + "는 " + food "를 먹는다.")
    }
	
	
	
	
}
