import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum =0;
		int menu =1, count;
		int price =0;
		String menuName ="";
		
		System.out.println("-*-*-menu-*-*-");
		System.out.println("1. 엄마는 외계인 3000");
		System.out.println("2. 민트초코 3000");
		System.out.println("3. 누가바 1000");
		System.out.println("4. 블랙소브레 3000");
		System.out.println("5. 체리쥬빌레 3000");
		System.out.println("0. 종료");
		System.out.println("메뉴와 갯수를 입력하세요.");
		
		while(menu!=0) {
			menu = scan.nextInt();
			if(menu == 0)
				break;
			count = scan.nextInt();
			
			switch(menu) {
			case 1:
					menuName = "엄마는 외계인";
					price =3000;
					break;
						
			case 2:
				
					menuName = "민트초코";
					price =3000;
					break;
				
			case 3:
				
					menuName = "누가바";
					price =1000;
					break;
				
			case 4:
				
					menuName = "블랙소브레";
					price =3000;
					break;
				
			case 5:
				
					menuName = "체리쥬빌레";
					price =3500;
					break;
			
			default:
				
					System.out.println("다시 입력해주세요");
			
		}
	
		System.out.println(menuName + count + "개" + price*count + "원");
		sum += price*count;
		}
		scan.close();
		System.out.println("총 합계" + sum);
		
		}
	}