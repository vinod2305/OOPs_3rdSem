class Person{
	String name;
	String address;
	Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public String getName(){
		return name;
	}
	public String getAdress(){
		return address;
	}
	public void setAdress(String address){
		this.address=address;
	}
	public String toString(){
		return name+"("+address+")";
	}
}
class Student extends Person{
	int numCourses=0;
	String courses[];
	int grades[];
	Student(String name,String address){
		super(name,address);
		courses=new String[30];
		grades=new int[30];
	}
	public String toString(){
	return 	super.toString();
	}
	public void addCourseGrade(String course,int grade){
		courses[numCourses]=course;
		grades[numCourses]=grade;
		++numCourses;
	}
	public void printGrades(){
		for(int i=0;i<numCourses;i++){
			System.out.println("Course "+courses[i]+" grade "+grades[i]);
		}
	}
	public double getAverageGrade(){
		int sum=0;
		for(int i=0;i<numCourses;i++){
                        sum=sum+grades[i];
                }
		return (double)sum/(double)numCourses;
	}
}
class Teacher extends Person{
	int numCourses=0;
	String courses[];
	Teacher(String name,String address){
		super(name,address);
		courses=new String[5];
	}
	public String toString(){
		return super.toString();
	}
	public boolean addCourse(String course){
		for(int i=0;i<numCourses;i++)
			if(courses[i]==course)
				return false;
		courses[numCourses]=course;
		++numCourses;
		return true;
	}
	public boolean removeCourse(String course){
                boolean found=false;
		int m=-1;
		for(int i=0;i<numCourses;i++)
			if(courses[i].equals(course)){
				m=i;
				found=true;
				break;
			}
		if(found){
			for(int i=m;i<numCourses-1;i++){
				courses[i]=courses[i+1];
			}
			numCourses--;
			return true;
		}
		else
			return false;
	}
}

public class test{
	public static void main(String args[]){
		Student s1=new Student("Tan ah","1 happy Ave");
		s1.addCourseGrade("1M101",97);
		s1.addCourseGrade("1M102",68);
		s1.printGrades();
		System.out.println("average" + s1.getAverageGrade());
		Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
      System.out.println(t1);
     String[] courses = {"IM101", "IM102", "IM101"};
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " added.");
         } else {
            System.out.println(course + " cannot be added.");
         }
      }
      for (String course: courses) {
         if (t1.removeCourse(course)) {
            System.out.println(course + " removed.");
         } else {
            System.out.println(course + " cannot be removed.");
         }
      }
   }
}


        


