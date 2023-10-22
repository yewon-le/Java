
public class RectangleMain {

	public static void main(String[] args) {
		Rectangle notebook=new Rectangle(17.5,23.1,"맥북 13인치");
		System.out.println("너비: "+ notebook.width + "cm, "+"무게: "+ notebook.height+"g, "+"제품명: "+notebook.name);
		Rectangle table = new Rectangle (67.1,52.3, "넓은책상(색상: white)");
		System.out.println("너비: "+table.width + "cm, "+ "무게 : " +table.height +"kg, "+"제품명: "+table.name );
		
	}

}
