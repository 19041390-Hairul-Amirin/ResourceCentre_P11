import java.util.ArrayList;

public class CategoryDB {

	static ArrayList<category> catList = new ArrayList<category>();

	public static void main(String[] args) {

		int option = 0;
		while (option != 4) {
			CategoryDB.showCategoryMenu();
			option = Helper.readInt("Enter option > ");
			 if (option == 1) {
			        //Add category
				 CategoryDB.addCategory(catList);
			        
			      }
			 else if (option == 2) {
			        // View all category
				 CategoryDB.viewAllCategory(catList);
			        
			      }
			 else if(option ==3) {
				 CategoryDB.delCategory(catList);
			 }
			 else if(option==4) {
				 System.out.println("Bye!");
				
			 }

		}

	}
	
	public static void showCategoryMenu() {
		
		System.out.println("1. Add Category");
		System.out.println("2. View Category");
		System.out.println("3. Delete Category");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}
	
	public static void addCategory(ArrayList<category> catList) {
		String name = Helper.readString("Enter category name > ");
		catList.add(new category(name));
		System.out.println("Item Added");

	}
	
	public static void viewAllCategory(ArrayList<category> ItemList) {
		String output = String.format(" %-30s\n", "Category Name");
		for (int i = 0; i < catList.size(); i++) {

			output += String.format("%-30s\n", catList.get(i));
		}
		System.out.println(output);
	}
	
	public static void delCategory(ArrayList<category> catList) {

		String aname = Helper.readString("Enter item's name > ");
		for (int i = 0; i < catList.size(); i++) {
			if (aname.equalsIgnoreCase(catList.get(i).getName())) {
				catList.remove(i);
				System.out.println("Category Deleted");
			} else {
				System.out.println("Deletion Failed");
			}
		}
	}
	
	
}