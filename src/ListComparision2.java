import java.util.ArrayList;
import java.util.List;

public class ListComparision2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Vinay");
		list.add("hi");
		list.add("hi");
		list.add("ks");
		list.add("sai");

		List<String> list1 = new ArrayList<>();
		list1.add("hi");
		list1.add("sai");
		list1.add("hi");
		list1.add("new");
		list1.add("me");
		// before retainAll
		System.out.println("first list is::::" + list);
		System.out.println("second list is:::::" + list1);
		// applying retainAll on list
		list.retainAll(list1);
		// After retainAll

		System.out.println("Common elements in both list and list1::" + list);

		//
		List<String> listall = new ArrayList<>();
		listall.addAll(list);

		System.out.println(listall);

		System.out.println("list1::" + list1);

		// With a little flaw...:(....duplicate elements are also printing...
	}
}
