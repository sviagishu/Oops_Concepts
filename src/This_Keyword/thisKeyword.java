package This_Keyword;

public class thisKeyword {
	
	private int id;
	private String name;
	
	public String getName( ) {
		return name;
	}
	
	public void setName(String name) {
		//name = name;  //- will give output null
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		// id = id; - will give output null
		this.id = id;
	}
	
//		System.out.println("print the details: " + id + " " + name);
		
	public static void main(String[] args) {
         thisKeyword th = new thisKeyword();
         th.setName("jk");
         System.out.println("Name: " + th.getName());
         th.setId(6783);
         System.out.println("Id: " + th.getId());
        }
}
