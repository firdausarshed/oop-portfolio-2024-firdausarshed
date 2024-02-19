package table;

public class StudentGrades {

	public static void main(String[] args) {
		 String name1 = "Fifi";
	     String name2 = "Mimi";
	     String name3 = "Keke";
	     String name4 = "Zaza";
	     String name5 = "Gigi";
	     
	     int labPoint1 = 43;
	     int labPoint2 = 50;
	     int labPoint3 = 39;
	     int labPoint4 = 45;
	     int labPoint5 = 48;
	     
	     int bonusPoint1 = 7;
	     int bonusPoint2 = 8;
	     int bonusPoint3 = 10;
	     int bonusPoint4 = 6;
	     int bonusPoint5 = 9;
	     
	     System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	     System.out.println("==\t    Student Points\t    ==");
	     System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
	     System.out.println("Name\t\tLab\tBonus\tTotal");
	     System.out.println("----\t\t---\t-----\t-----");
	     
	     int totalPoints1 = labPoint1 + bonusPoint1;
	     int totalPoints2 = labPoint2 + bonusPoint2;
	     int totalPoints3 = labPoint3 + bonusPoint3;
	     int totalPoints4 = labPoint4 + bonusPoint4;
	     int totalPoints5 = labPoint5 + bonusPoint5;
	     
	     System.out.println(name1 + "\t\t" + labPoint1 + "\t" + bonusPoint1 + "\t" + totalPoints1);
	     System.out.println(name2 + "\t\t" + labPoint2 + "\t" + bonusPoint2 + "\t" + totalPoints2);
	     System.out.println(name3 + "\t\t" + labPoint3 + "\t" + bonusPoint3 + "\t" + totalPoints3);
	     System.out.println(name4 + "\t\t" + labPoint4 + "\t" + bonusPoint4 + "\t" + totalPoints4);
	     System.out.println(name5 + "\t\t" + labPoint5 + "\t" + bonusPoint5 + "\t" + totalPoints5);

	}

}
