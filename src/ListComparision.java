import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListComparision {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		List<String> listb = new ArrayList<String>();

		lista.add("Vinay");
		lista.add("sai");
		lista.add("ks");
		lista.add("hi");
		lista.add("hi");
		lista.add("sai");

		listb.add("sai");
		listb.add("hi");
		listb.add("hi");
		listb.add("welcome");

		// Create an aplusb list which will contain both list (list1 and list2) in which
		// common element will occur twice.
		List<String> listapluslistb = new ArrayList<String>(lista);
		listapluslistb.addAll(listb);
		System.out.println("All the elements in both the lists:::" + listapluslistb);

		// Create an aunionb set which will contain both list (list1 and list2) in which
		// common element will occur once
		Set<String> listaunionlistb = new HashSet<String>(lista);
		listaunionlistb.addAll(listb);

		for (String s : listaunionlistb) {
			listapluslistb.remove(s);
		}
		System.out.println(listapluslistb);
		// .....:)...
		// Printing Common elements in both the lista and listb by third List.
		List<String> st = new ArrayList<>();
		st.addAll(listapluslistb);
		System.out.println(listapluslistb);

		// Printing common element which will occur once.
		System.out.println(listaunionlistb);
	}
}
