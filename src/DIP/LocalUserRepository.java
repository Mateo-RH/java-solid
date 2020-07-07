package DIP;

public class LocalUserRepository implements UserRepository{
	
	public User getUser(int id) {
		// Logica para traer el usuario de la BD
		
		User user = new User(id, "mateo", "a@a.co");
		return user;
	}

}
