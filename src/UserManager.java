
public class UserManager {
	public void addComment(User user) {
		System.out.println(user.firstName + " yorumunuz eklendi");
	}
	
	public void signUp(User user) {
		System.out.println(user.username + " kaydınız oluşturuldu");
	}
	
	public void signIn(User user) {
		System.out.println(user.username + " giriş yapıldı");
	}
}
