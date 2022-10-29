class Student{
	String name;
	int id;
}

class Sports extends Student{
	char s_grade;
}

class Exam extends Student{
	char e_grade;
}

interface SportExam{
	Sports s = new Sports();
	Exam e = new Exam();
}

class Results implements SportExam{
	public static void main(String[] args){
		s.name = "John";
		s.id = 1;
		s.s_grade = 'A';
		e.name = "John";
		e.id = 1;
		e.e_grade = 'B';
		System.out.println("Name: " + s.name);
		System.out.println("ID: " + s.id);
		System.out.println("Sport Grade: " + s.s_grade);
		System.out.println("Exam Grade: " + e.e_grade);
	
		String final_result;
		void display(){
			System.out.println("The final result is "+final_result);
		}
	}
}