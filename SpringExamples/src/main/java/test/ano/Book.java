package test.ano;

@Author(first = "Oompah", last = "test")
public class Book {
	String firstName = "tes";
	String lastName;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public String getFirstName() {
		return firstName;
	}
}
