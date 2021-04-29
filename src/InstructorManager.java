
public class InstructorManager extends UserManager {
	public void addLesson(Instructor instructor) {
		System.out.println("Yeni ders derslerinize eklendi");
	}
	
	public void getLessons(Instructor instructor) {
		String[] lessons = instructor.getGivenLessonName();
		System.out.println(instructor.firstName + " " + instructor.lastName + " dersleriniz : ");
		for (String lesson : lessons) {
			System.out.println("  > "+lesson);
		}
	}
}
