import java.util.Scanner;

public class HighestScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter The Number of Student ");
		int numberOfStudent = input.nextInt();
	int highest =0;
	int score = 0;
	String highestScoreName = " ";
	String name;
	int count =0;
while(count<=numberOfStudent){
	count++;	
	System.out.print("Enter Student Name ");
	  name = input.next();
	System.out.print("Enter Student  Score ");
	 score = input.nextInt();
	if(score<0){
		System.out.print( "Enter Your Right Score Abi You Dey Owe Mark Ni Olodo");
			score = input.nextInt();
	}
    if(score>highest){
	highest = score;
	highestScoreName = name;
	
	}
	
} 
	System.out.printf( "The Student with highest Score is %s with Score of %d ",highestScoreName,highest);
		

	}





}