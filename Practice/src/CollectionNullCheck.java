import java.util.ArrayList;
import java.util.Collections;

public class CollectionNullCheck {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("two");
		list.add("three");
		
//		list.forEach(i -> System.out.println(i));
		list.forEach(System.out::println);
	}
}
