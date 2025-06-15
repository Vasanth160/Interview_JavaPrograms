package Abstract;

public interface Animal {
	void cat();
	void dog();
	void lion();
	default void tiger() {
		System.out.println("Lion is not a pet animal");
	}

}
