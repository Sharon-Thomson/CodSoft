import java.io.*;

class reportcard{

	float m1,m2,m3,m4,total;
    double averagePercentage;
	public void input(){
		try{
			DataInputStream d=new DataInputStream (System.in);
			System.out.println("REPORT CARD");
			System.out.print("Enter Java Programming marks: ");
			m1=Float.parseFloat(d.readLine());
			System.out.print("Enter Discrete Mathematics marks : ");
			m2=Float.parseFloat(d.readLine());
			System.out.print("Enter Profesional English marks : ");
			m3=Float.parseFloat(d.readLine());
            System.out.print("Enter Data Structure marks : ");
			m4=Float.parseFloat(d.readLine());
			}catch(Exception e){
				System.out.print(e);
				}
		}
    public void cal(){
        total=m1+m2+m3+m4;
        averagePercentage = total / 4.0;
        System.out.print("Total Marks = "+total+"\n");
        System.out.print("Average Percentage = "+averagePercentage+"%");
		}

	public void grades(){

        char grade;
        if(averagePercentage>=90){
            grade ='A';
        }else if(averagePercentage>=80){
            grade = 'B';
        }else if(averagePercentage>=70){
            grade = 'C';
        }else if(averagePercentage>=60){
            grade = 'D';
        }else {
            grade = 'F';
        }
		System.out.println("\nGrade = " + grade);
		}
	}

class Studentgrades{
	public static void main (String args[]) throws IOException{
		reportcard r = new reportcard();
        r.input();
        r.cal();
        r.grades();

		}
	}
