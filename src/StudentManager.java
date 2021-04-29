
public class StudentManager extends UserManager{
	public void doneLesson(Student student) {
		student.setLessonCount(student.getLessonCount() + 1);
		System.out.println("Ders sayınız "+student.getLessonCount()+" olarak güncellenmiştir");
	}
	
	public void removeLesson(Student student) {
		student.setLessonCount(student.getLessonCount() - 1);
		System.out.println("Ders sayınız "+student.getLessonCount()+" olarak güncellenmiştir");
	}
}
