
public class UserManager {
	public void addComment(User user) {
		System.out.println(user.getFirstName() + " yorumunuz eklendi");
	}
	
	public void signUp(User user) {
		System.out.println(user.getUsername() + " kaydınız oluşturuldu");
	}
	
	public void signIn(User user) {
		System.out.println(user.getUsername() + " giriş yapıldı");
	}
}
