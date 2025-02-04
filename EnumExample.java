enum Day{
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSAY(4),FRIDAY(5),SATURDAY(6);
	public final int index;
	Day(int index) {
		this.index=index;
	}
public int getIndex() {
	return index;
}
}
public class EnumExample {
	public static void main (String[] args) {
		Day today=Day.WEDNESDAY;
		int dayIdx=today.getIndex();
		System.out.println("Today is "+today+" Index : "+dayIdx+" ");
		switch(today) {
		case MONDAY:
		System.out.println("Its Monday!!"); break;
		case WEDNESDAY:
		System.out.println("Its Wednesday!!"); break;
		case FRIDAY:System.out.println("Its Friday"); break;
		default:System.out.println("its neither Monday nor Wednesday nor Friday");
		}
	
			
	}

}




