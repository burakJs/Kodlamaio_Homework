
public class Main {

	public static void main(String[] args) {
		Instructor engin = new Instructor();
		engin.setId(1);
		engin.setFirstName("Engin");
		engin.setLastName("Demiroğ");
		String[] givenLesson = {"C# ve Angular Eğitimi","Java ve React eğitimi"};
		engin.setGivenLessonName(givenLesson);
		engin.setUsername("Engin123");
		engin.setPassword("Engin123123;");
		
		Student burak = new Student();
		burak.setId(2);
		burak.setFirstName("Burak");
		burak.setLastName("İmdat");
		burak.setLessonCount(0);
		burak.setUsername("Burak112233");
		burak.setPassword("Burak112233445566;");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addComment(burak);
		studentManager.doneLesson(burak);
		studentManager.removeLesson(burak);
		studentManager.signUp(burak);
		studentManager.signIn(burak);
		
		System.out.println();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addComment(engin);
		instructorManager.addLesson(engin);
		instructorManager.getLessons(engin);
		instructorManager.signUp(engin);
		instructorManager.signIn(engin);
		
	}

}
